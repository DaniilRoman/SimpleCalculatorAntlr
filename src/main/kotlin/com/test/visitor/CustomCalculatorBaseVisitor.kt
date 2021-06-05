package com.test.visitor

import com.test.CalculatorBaseVisitor
import com.test.CalculatorParser
import java.util.logging.Logger

class CustomCalculatorBaseVisitor : CalculatorBaseVisitor<Unit>() {
    private val result = 0

    companion object {
        val log = Logger.getLogger(CustomCalculatorBaseVisitor::class.java.name)
    }

    override fun visitEquation(ctx: CalculatorParser.EquationContext?) {
        log.info("Entry point of calculation")
        super.visitEquation(ctx)
    }

    override fun visitFuncname(ctx: CalculatorParser.FuncnameContext?) {
        super.visitFuncname(ctx)
    }

}