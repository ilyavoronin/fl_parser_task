import org.antlr.v4.runtime.TokenStream
import java.lang.Exception

class PlangCustomGrammarParser(tokenStream: TokenStream): PlangGrammarParser(tokenStream) {
    fun parseInput(): Program {
        val progVisitor = ProgramVisitor()
        println(this.currentToken)
        return progVisitor.visit(this.start()).also { println(this.currentToken) }
    }

    fun parseProg(): Program {
        val progVisitor = ProgramVisitor()
        return progVisitor.visit(this.prog())
    }

    private class ProgramVisitor: PlangGrammarBaseVisitor<Program>() {
        override fun visitProg(ctx: ProgContext): Program {
            val rvisitor = RuleVisitor()
            val avisitor = AtomVisitor()
            val rules = ctx.rrule().map { it.accept(rvisitor) }
            val target = ctx.tar().atom().map {it.accept(avisitor)}

            val relations = rules.groupBy { it.head.name }.map {(name, rules) -> Relation(name, rules)}
            return Program(relations, target)
        }
    }

    private class RuleVisitor: PlangGrammarBaseVisitor<Rule>() {
        override fun visitRrule(ctx: RruleContext): Rule {
            val avisitor = AtomVisitor()
            val head = ctx.rhead().accept(avisitor)
            val body = ctx.rbody()?.let{it.atom().map {it.accept(avisitor)} } ?: emptyList()
            return Rule(head, body)
        }
    }

    private class AtomVisitor: PlangGrammarBaseVisitor<Atom>() {
        override fun visitAtom(ctx: AtomContext): Atom {
            val argVisitor = ArgVisitor()
            val name = ctx.IDENT().text
            val arglist = ctx.body?.let{it.arg().map {it.accept(argVisitor)}} ?: emptyList()

            return Atom(name, arglist)
        }
    }

    private class ArgVisitor: PlangGrammarBaseVisitor<Arg>() {
        override fun visitArg(ctx: ArgContext): Arg {
            if (ctx.childCount == 1) {
                return this.visit(ctx.children.first())
            }
            else {
                throw ParserException("grammar error: arg should have exactly one child in the tree")
            }
        }

        override fun visitAtom(ctx: AtomContext): Arg {
            return ctx.accept(AtomVisitor())
        }

        override fun visitVar(ctx: VarContext): Arg {
            return Var(ctx.VAR().text)
        }
    }

    class ParserException(override val message: String): Exception(message)
}