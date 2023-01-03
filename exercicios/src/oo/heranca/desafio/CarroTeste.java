package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		Carro ferrari = new Ferrari();
		
		System.out.println(civic.velocidadeAtual);
		System.out.println(ferrari.velocidadeAtual);
		
		civic.acelerar();
		ferrari.acelerar();

		System.out.println(civic.velocidadeAtual);
		System.out.println(ferrari.velocidadeAtual);

		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		System.out.println(civic.velocidadeAtual);
		System.out.println(ferrari.velocidadeAtual);
		
		System.out.println(civic);
		System.out.println(ferrari);
		
	}
}
