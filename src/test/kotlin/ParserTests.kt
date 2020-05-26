import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.File

class ParserTests {
    fun getResource(name: String): String {
        return this::class.java.getResource(name).readText()
    }

    fun getResourceFile(name: String): File {
        return File(this::class.java.getResource(name).path)
    }

    @Test
    fun simpleTest1() {
        val inputString = """
            abacaba(aba, F, caba(F)) -> aba, caba(F).
            abacaba.
            -?
            abacaba(F), aba.
        """.trimIndent()
        val expected = Program(
            listOf(
                Relation(
                    "abacaba",
                    listOf(
                        Rule(
                            Atom(
                                "abacaba",
                                listOf(
                                    Atom("aba", emptyList()),
                                    Var("F"),
                                    Atom("caba", listOf(Var("F")))
                                )
                            ),
                            listOf(
                                Atom("aba", emptyList()),
                                Atom("caba", listOf(Var("F")))
                            )
                        ),
                        Rule(
                            Atom(
                                "abacaba", emptyList()
                            ),
                            emptyList()
                        )
                    )
                )
            ),
            listOf(
                Atom("abacaba", listOf(Var("F"))),
                Atom("aba", emptyList())
            )
        )

        val actual = PlangParser().parse(inputString)

        assertEquals(actual, expected)
    }

    @Test
    fun simpleTest2() {
        val inputString = """
            aba -> daba.
            daba.
            aba.
            laba.
            aba.
            daba.
            -?.
        """.trimIndent()

        val expected = Program(
            listOf(
                Relation(
                    "aba",
                    listOf(
                        Rule(
                            Atom("aba", emptyList()),
                            listOf(Atom("daba", emptyList()))
                        ),
                        Rule(
                            Atom("aba", emptyList()),
                            emptyList()
                        ),
                        Rule(
                            Atom("aba", emptyList()),
                            emptyList()
                        )
                    )
                ),
                Relation(
                    "daba",
                    listOf(
                        Rule(
                            Atom("daba", emptyList()),
                            emptyList()
                        ),
                        Rule(
                            Atom("daba", emptyList()),
                            emptyList()
                        )
                    )
                ),
                Relation(
                    "laba",
                    listOf(
                        Rule(Atom("laba", emptyList()), emptyList())
                    )
                )
            ),
            emptyList()
        )

        val actual = PlangParser().parse(inputString)

        assertEquals(actual, expected)
    }

    @Test
    fun testFail1() {
        val inputString = """
            aba(F(aba)).
            -?.
        """.trimIndent()
        assertThrows(PlangCustomGrammarParser.ParserException::class.java, {PlangParser().parse(inputString)})
    }

    @Test
    fun testFail2() {
        val inputString = """
            aba -> caba.
            daba -> laba.
            -?
            aba.
            caba.
        """.trimIndent()
        assertThrows(PlangCustomGrammarParser.ParserException::class.java, {PlangParser().parse(inputString)})
    }

    @Test
    fun testFail3() {
        val inputString = """
            aba() -> caba.
            -?.
        """.trimIndent()
        assertThrows(PlangCustomGrammarParser.ParserException::class.java, {PlangParser().parse(inputString)})
    }

    @Test
    fun testFail4() {
        val inputString = """
            Faba(caba) -> daba.
            -?.
        """.trimIndent()
        assertThrows(PlangCustomGrammarParser.ParserException::class.java, {PlangParser().parse(inputString)})
    }

    @Test
    fun testStringSuccess1() {
        val inputFile = getResourceFile("test1")
        val expected = getResource("test1.out")

        val actual = PlangParser().parse(inputFile)
        assertEquals(actual.toString(), expected)
    }

    @Test
    fun testStringSuccess2() {
        val inputFile = getResourceFile("test2")
        val expected = getResource("test2.out")

        val actual = PlangParser().parse(inputFile)
        assertEquals(actual.toString(), expected)
    }
}