package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic(150.0);

		civic.frear();

		System.out.println(civic);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic);
		
//		
		
		Carro ferrari = new Ferrari(200.0);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		
		System.out.println(ferrari);

//		
		
		Ferrari ferrari2 = new Ferrari(200.0);
		ferrari2.ligarTurbo();
		ferrari2.ligarAr();
		ferrari2.desligarAr();
		
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		ferrari2.acelerar();
		
		
		System.out.println(ferrari2);
		
	}
}
