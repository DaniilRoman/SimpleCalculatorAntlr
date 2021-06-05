package com.test.visitor

import org.antlr.v4.runtime.*
import java.util.logging.Logger

class ParsingException(msg: String): Exception(msg)

class CustomErrorListener: BaseErrorListener() {
    companion object {
        val log = Logger.getLogger(CustomErrorListener::class.java.name)
    }

    override fun <T : Token?> syntaxError(recognizer: Recognizer<T, *>?, offendingSymbol: T, line: Int, charPositionInLine: Int, msg: String?, e: RecognitionException?) {
        log.info("Wow, this is error")
        throw ParsingException("Syntax error on line $line with position $charPositionInLine. $msg")
    }
}