package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Rose", "Paul", "Anne", "Lola");
		
		System.out.println("Forma tradicional...");
		for (String a : aprovados) {
			System.out.println(a);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(
			a -> System.out.println(a)
		);
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(
			a -> imprimir(a)
		);
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(ForEach::imprimir);
		
	}
	
	static void imprimir(String nome) {
	System.out.println("Meu nome é: " + nome);

	}
}
