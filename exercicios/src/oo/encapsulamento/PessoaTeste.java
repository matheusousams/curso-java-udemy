package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(-9, "Fulano", "Silva");
		
		System.out.println(pessoa);
		
		pessoa.setIdade(600);
		
		System.out.println(pessoa);
	}
}
