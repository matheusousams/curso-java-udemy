package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		boolean trab1 = true;
		boolean trab2 = true;
		
		boolean comprouTV32 = trab1 ^ trab2;
		boolean comprouTV50 = trab1 && trab2;
		boolean tomouSorvete = trab1 || trab2;
		boolean ficouSaudavel = !tomouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV32);
		System.out.println("Comprou TV 32\"? " + comprouTV50);
		System.out.println("Comprou Sorvete? " + tomouSorvete);
		System.out.println("Mais saudável? " + ficouSaudavel);
		
		
	}
}
