package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cont = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				cont++;
			}else if(nota!=-1) {
				System.out.println("Nota Inválida!");
			}
		}
		
		double media = total/cont;
		System.out.println("Média = " + media);
		
		scanner.close();
	}
}
