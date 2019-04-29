import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("SQRT(4) * (3 + (ABS(-4) * 2)) / 2");
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();

        CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
        Double result = calcVisitor.visit(tree);
        System.out.println("Result: " + result);

        //show AST in console
        System.out.println(tree.toStringTree(parser));

        //show AST in GUI
//        JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),tree);
//        viewr.open();
    }
}
