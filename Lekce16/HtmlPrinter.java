package Lekce16;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

public class HtmlPrinter implements QuadraticEquationPrinter {

	@Override
	public static void printEquation(int a, int b, int c, int x1, int x2) {
		System.out.printf("dx<sup>2</sup> + %dx + %d =  \n", a, b, c);
}

}
