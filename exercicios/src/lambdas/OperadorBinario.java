package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(5.6, 3.9));
		
		BiFunction<Double, Double, String> resultado =
				(n1, n2) -> ((n1+n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(7.0, 7.0));
		
		Function<Double, String> conceito = 
				m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(conceito.apply(7.05));
				
	}
}
