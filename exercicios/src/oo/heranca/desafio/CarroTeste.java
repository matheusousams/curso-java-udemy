package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic(150.0);
		Carro ferrari = new Ferrari(200.0);
		
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
		
		System.out.println(civic);
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		System.out.println(ferrari);
		
	}
}
