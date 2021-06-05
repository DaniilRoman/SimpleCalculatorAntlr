package com.test

import com.test.engine.visit
import com.test.visitor.ParsingException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BaseVisitorTest {

    @Test
    fun correctParsing() {
        visit("(sin (x)^2) + (cos(x)^2) = 1")
    }

    @Test
    fun inCorrectParsing() {
        assertThrows<ParsingException> { visit("qwe 23 wqe") }
    }
}