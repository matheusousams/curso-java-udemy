package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String sal1 = scanner.next().replace(",", ".");
		String sal2 = scanner.next().replace(",", ".");
		String sal3 = scanner.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(sal1);		
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double media = (salario1 + salario2 + salario3)/3.0;
		System.out.printf("%.2f%n", media);
		
		scanner.close();
	}
}
