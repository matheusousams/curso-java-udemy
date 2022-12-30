package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		
		int numeroDeNotas = scanner.nextInt();
		
		double[] notas = new double[numeroDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextInt();
		}
				
		double total = 0;
		for(double nota: notas) {
			total+=nota;
		}
		
		double media = total / notas.length;
		System.out.println("A m�dia � " + media + "!");
		
		scanner.close();
	}
}
