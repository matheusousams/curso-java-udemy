
package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		++b;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
