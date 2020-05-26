import org.antlr.v4.runtime.*


class PlangCustomGrammarParser(tokenStream: TokenStream): PlangGrammarParser(tokenStream) {
    init {
        this.removeErrorListeners()
        this.addErrorListener(VerboseListener())
    }

    fun parseInput(): Program {
        val progVisitor = ProgramVisitor()
        return progVisitor.visit(this.start())
    }

    fun parseProg(): Program {
        val progVisitor = ProgramVisitor()
        return progVisitor.visit(this.start())
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

        override fun visitStart(ctx: StartContext): Program {
            return visit(ctx.prog())
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

    class VerboseListener : BaseErrorListener() {
        override fun syntaxError(
            recognizer: Recognizer<*, *>,
            offendingSymbol: Any,
            line: Int, charPositionInLine: Int,
            msg: String,
            e: RecognitionException?
        ) {
            val stack: MutableList<String?> = (recognizer as Parser).ruleInvocationStack
            stack.reverse()
            System.err.println("rule stack: $stack")
            System.err.println(
                "line " + line + ":" + charPositionInLine + " at " +
                        offendingSymbol + ": " + msg
            )
            throw ParserException("Failed to parse input")
        }
    }

    class ParserException(override val message: String): Exception(message)
}