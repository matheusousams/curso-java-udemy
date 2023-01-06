package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 3000.00;
		
		Produto produto = new Produto("Celular", 5000.00, 0.50);
		System.out.println(isCaro.test(produto));
	}
}
