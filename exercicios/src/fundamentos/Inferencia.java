package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; //declarada e inicializada
		System.out.println(a); //usada
		
		a = 12; //pode tipo inteiro em variavel flutuante
		System.out.println(a);
		
		//a = "..."; não pode tipo string em variavel double
		
		//o tipo var só funciona a partir do java 10	
		/*
		*var b = 4.5;
		*System.out.println(b);
		*
		*var c = "Texto";
		*System.out.println(c);
		*
		*c = "Outro Texto";
		*System.out.println(c);
		*
		*c = 4.5 não pode usar tipo flutuante em variavel inferida como string
		*/
		
		double d; //variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); //variavel foi usada
		
//		var e;			Tem que declarar e inicializar ao mesmo tempo quanto é var
//		e = 123.45;
		
//		var f = 12; //inteiro
//		f = 12.01
//		System.out.println(f);
		
	}
}
