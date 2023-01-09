package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Notebook", 3235.89, 0.0);
		
		Function<Produto, Double> precoComDesconto = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> precoComImposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> precoComFrete = preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;
		UnaryOperator<Double> precoArredondado = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
		Function<Double, String> precoFormatado = preco -> ("R$" + preco).replace(".", ",");

		String preco = precoComDesconto
				.andThen(precoComImposto)
				.andThen(precoComFrete)
				.andThen(precoArredondado)
				.andThen(precoFormatado)
				.apply(produto);
		
		System.out.println(preco);
		
	}
}
