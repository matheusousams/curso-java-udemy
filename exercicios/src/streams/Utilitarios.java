package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	private Utilitarios() {
		// TODO Auto-generated constructor stub
	}
	
	public final static UnaryOperator<String> maiuscula =
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";
					
	public static String grito(String n) {
		return n + "!!! ";
	}
	
}
