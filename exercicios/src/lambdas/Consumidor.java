package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 2.0, 0.05);
		imprimir.accept(p1);
		
		System.out.println();
		
		Produto p2 = new Produto("Lápis", 3.0, 0.05);
		Produto p3 = new Produto("Borracha", 4.0, 0.05);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
