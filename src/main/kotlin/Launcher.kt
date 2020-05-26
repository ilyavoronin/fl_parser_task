import java.io.File

fun main(args: Array<String>) {
    val inputFile = File(args[0])
    val program = PlangParser().parse(inputFile)
    println(program)
}