package com.test.engine

import com.test.CalculatorLexer
import com.test.CalculatorParser
import com.test.visitor.CustomCalculatorBaseVisitor
import com.test.visitor.CustomErrorListener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext


fun main() {
    visit(
        "qwe 23 wqe"
//        "(sin (x)^2) + (cos(x)^2) = 1"
    )
}

fun visit(source: String) {
    CustomCalculatorBaseVisitor().visit(
        generateTree(source)
    )
}

private fun generateTree(sourceString: String): ParserRuleContext {
    val inputStream = CharStreams.fromString(sourceString)
    val lexer = CalculatorLexer(inputStream)
    lexer.removeErrorListeners()

    val tokenStream = CommonTokenStream(lexer)
    val parser = CalculatorParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(CustomErrorListener())

    val ast = parser.equation() // starting point
    return ast
}