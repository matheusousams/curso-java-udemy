package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Quina: %d %d %d %d %d %n", 45,56,78,65,34);
		System.out.printf("Salario: %.2f%n", 2345.0978);
		System.out.printf("Nome: %s%n", "Maria");
		
		System.out.println("\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Insira sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Insira idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
		
		System.out.printf("Nome = %s\nSobrenome = %s\nIdade = %d",
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
