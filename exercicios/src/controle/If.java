package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		
		double media = scanner.nextDouble();
		
		if(media<=10.0 && media>=7.0)
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		
		if(media<=7.0 && media >=4.0)
			System.out.println("Recupercao");
		
		boolean reprovacao = media<4.0 && media>=0.0;
		
		if(reprovacao)
			System.out.println("Reprovado");
			
		scanner.close();
	}
}
