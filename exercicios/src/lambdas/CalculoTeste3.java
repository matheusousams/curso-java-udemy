package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// NÃO: int -> Double
		// double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(1.0, 2.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(1.0, 2.0));
		
//		
		
		BinaryOperator<Integer> calc2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc2.apply(1, 2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(1, 2));
		
	}
}
