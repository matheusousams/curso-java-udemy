package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		Function<String, String> resultado =
				valor -> "O resultado é: " + valor;
				
		Function<String, String> exclamacao =
				valor -> valor + "!!!";
				
		Function<String, String> interrogacao =
				valor -> valor + "???";
		
		String resultadoFinal1 = parOuImpar.andThen(resultado).andThen(exclamacao).apply(32);
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar.andThen(resultado).andThen(interrogacao).apply(33);
		System.out.println(resultadoFinal2);
				
		System.out.println(parOuImpar.apply(33));
	}
}
