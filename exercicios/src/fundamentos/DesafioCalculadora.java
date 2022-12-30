package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1 = scanner.nextDouble();
		String sinal = scanner.next();
		double num2 = scanner.nextDouble();
		
		double soma = num1 + num2;
		double subtracao = num1-num2;
		double multiplicacao = num1*num2;
		double divisao = num1/num2;
		double resto = num1%num2;
		
		double resultado = "+".equals(sinal) ? soma : 0;
		resultado = "-".equals(sinal) ? subtracao : resultado;
		resultado = "*".equals(sinal) ? multiplicacao : resultado;
		resultado = "/".equals(sinal) ? divisao : resultado;
		resultado = "%".equals(sinal) ? resto : resultado;
		
		System.out.println(resultado);
		
		scanner.close();
	}
	
}
