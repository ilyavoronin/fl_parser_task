import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File
import java.io.FileInputStream

class PlangParser {
    fun parse(input: String): Program {
        val stream = CharStreams.fromString(input)
        val parser = getParser(stream)
        return parser.parseProg()
    }

    fun parse(file: File): Program {
        val stream = CharStreams.fromStream(FileInputStream(file))
        val parser = getParser(stream)
        return parser.parseInput()
    }

    private fun getParser(cstream: CharStream): PlangCustomGrammarParser {
        val lexer = PlangGrammarLexer(cstream)
        val tokens = CommonTokenStream(lexer)
        return PlangCustomGrammarParser(tokens)
    }
}