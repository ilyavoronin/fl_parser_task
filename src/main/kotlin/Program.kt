
data class Program(val rels: List<Relation>, val tar: List<Atom>) {
    override fun toString(): String {
        var res = ""
        res += "Program with ${rels.size} relations:\n"
        res += rels.mapIndexed {i, s -> s.getString(4, i + 1)}
            .joinToString(separator = "\n") + "\n"
        if (tar.isNotEmpty()) {
            res += "with target:\n"
            res += tar.mapIndexed { i, s -> s.getString(4, i + 1) }
                .joinToString(separator = "\n")
        } else {
            res += "with empty target"
        }
        return res
    }
}

interface Ast {
    fun getString(indent: Int, num: Int? = null): String {
        val sindent = " ".repeat(indent)
        val numString = num?.let {"[$it]"} ?: ""
        return sindent + numString + when (this) {
            is Var -> "variable `${this.name}`"
            is Atom -> {
                val res = "atom `${this.name}`"
                if (this.args.isEmpty()) {
                    "$res without arguments"
                } else {
                    val t = args.mapIndexed {i, s -> s.getString(indent + 4, i + 1)}
                        .joinToString(separator = "\n")
                    "$res with ${this.args.size} arguments:\n$t"
                }
            }
            is Relation -> {
                val res = "relation `${this.name}` with ${rules.size} rules:\n";
                val t = this.rules.mapIndexed {i, s -> s.getString(indent + 4, i + 1) }
                    .joinToString(separator = "\n")
                res + t
            }
            is Rule -> {
                val res = "rule with head \n${head.getString(indent + 4)}\n"
                if (body.isEmpty()) {
                    res + sindent + "with empty body"
                } else {
                    val t = body.mapIndexed {i, s -> s.getString(indent + 4, i + 1)}
                        .joinToString(separator = "\n")
                    res + sindent + "with body of size ${body.size}\n" + t
                }
            }
            else -> ""
        }
    }
}

interface Arg : Ast

data class Var(val name: String): Arg

data class Atom(val name: String, val args: List<Arg>): Arg

data class Rule(val head: Atom, val body: List<Atom>): Ast

data class Relation(val name: String, val rules: List<Rule>): Ast
