// Generated from src/main/java/Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(CalculatorParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultOrDiv}
	 * labeled alternative in {@link CalculatorParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultOrDiv(CalculatorParser.ToMultOrDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link CalculatorParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CalculatorParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CalculatorParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CalculatorParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToSqrt}
	 * labeled alternative in {@link CalculatorParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSqrt(CalculatorParser.ToSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link CalculatorParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(CalculatorParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAbs}
	 * labeled alternative in {@link CalculatorParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAbs(CalculatorParser.ToAbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomRhs}
	 * labeled alternative in {@link CalculatorParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomRhs(CalculatorParser.AtomRhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link CalculatorParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(CalculatorParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsCalc}
	 * labeled alternative in {@link CalculatorParser#abs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsCalc(CalculatorParser.AbsCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SqrtCalc}
	 * labeled alternative in {@link CalculatorParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtCalc(CalculatorParser.SqrtCalcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link CalculatorParser#unaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(CalculatorParser.ChangeSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculatorParser#unaryAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(CalculatorParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(CalculatorParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalculatorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(CalculatorParser.BracesContext ctx);
}