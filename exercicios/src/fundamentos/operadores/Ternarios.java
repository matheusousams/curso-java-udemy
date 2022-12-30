package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		int numero = 7;
		int resto = numero%2;
		String resultado = resto==0 ? "Par" : "Ímpar";
		System.out.println(resultado);
	}
}
