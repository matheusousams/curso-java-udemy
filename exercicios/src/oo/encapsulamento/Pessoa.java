package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(int idade, String nome, String sobrenome) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade <= 120)
			this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNomeCompleto() + "\nIdade: " + getIdade();
	}
	
}
