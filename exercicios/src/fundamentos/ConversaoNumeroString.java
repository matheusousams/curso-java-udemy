package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer inteiro = 10000;
		System.out.println(inteiro.toString().length());
		
		int inteiro2 = 9999;
		System.out.println(Integer.toString(inteiro2).length());
		
		int num = 321;
		
		System.out.println(("" + num).length());
	}
}
