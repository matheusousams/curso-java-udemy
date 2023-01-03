package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		System.out.println(car1.estaLigado());
		
		car1.ligar();
		System.out.println(car1.estaLigado());
		
		System.out.println(car1.motor.giros());
		
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		
		System.out.println(car1.motor.giros());
		
		car1.frear();
		System.out.println(car1.motor.giros());
		car1.frear();
		System.out.println(car1.motor.giros());
		car1.frear();
		System.out.println(car1.motor.giros());
		car1.frear();		
		System.out.println(car1.motor.giros());
		car1.frear();		
		System.out.println(car1.motor.giros());
		car1.frear();		
		System.out.println(car1.motor.giros());
		
//		Faltou Encapsulamento!!!
//		car1.motor.fatorInjecao = -20;
		
		System.out.println(car1.motor.giros());
		
	}
}
