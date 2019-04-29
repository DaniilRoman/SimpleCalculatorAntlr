public class CalculatorBaseVisitorImpl extends CalculatorBaseVisitor<Double> {

    @Override
    public Double visitPlus(CalculatorParser.PlusContext ctx) {
        return visit(ctx.lhs()) + visit(ctx.rhs());
    }
    
    @Override
    public Double visitMinus(CalculatorParser.MinusContext ctx) {
        return visit(ctx.lhs()) - visit(ctx.rhs());
    }

    @Override
    public Double visitMultiplication(CalculatorParser.MultiplicationContext ctx) {
        return visit(ctx.rhs()) * visit(ctx.unaryAtom());
    }

    @Override
    public Double visitDivision(CalculatorParser.DivisionContext ctx) {
        return visit(ctx.rhs()) / visit(ctx.unaryAtom());
    }


    @Override public Double visitAbsCalc(CalculatorParser.AbsCalcContext ctx) {
        return Math.abs(visit(ctx.unaryAtom()));
    }


    @Override public Double visitSqrtCalc(CalculatorParser.SqrtCalcContext ctx) {
        return Math.sqrt(visit(ctx.unaryAtom()));
    }

    @Override
    public Double visitChangeSign(CalculatorParser.ChangeSignContext ctx) {
        return -1*visit(ctx.unaryAtom());
    }

    @Override
    public Double visitBraces(CalculatorParser.BracesContext ctx) {
        return visit(ctx.lhs());
    }

    @Override
    public Double visitInt(CalculatorParser.IntContext ctx) {
        return Double.parseDouble(ctx.INT().getText());
    }

    @Override
    public Double visitDouble(CalculatorParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitCalculate(CalculatorParser.CalculateContext ctx) {
        return visit(ctx.lhs());
    }
}
