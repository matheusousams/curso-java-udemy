package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		System.out.println(convidado.getPeso());
		
		Sorvete sorvete = new Sorvete(0.4);
		
		convidado.comer(sorvete);
		System.out.println(convidado.getPeso());
		
		convidado.comer(sorvete);
		System.out.println(convidado.getPeso());
	}
}
