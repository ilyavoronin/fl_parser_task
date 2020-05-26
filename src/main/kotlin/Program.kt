
data class Program(val rels: List<Relation>, val tar: List<Atom>)

interface Ast

interface Arg

data class Var(val name: String): Arg

data class Atom(val name: String, val args: List<Arg>): Arg

data class Rule(val head: Atom, val body: List<Atom>): Ast

data class Relation(val name: String, val rules: List<Rule>): Ast
