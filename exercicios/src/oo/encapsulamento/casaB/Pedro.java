package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana irma = new Ana();
	
	void testeAcessos() {
//		System.out.println(irma.segredo); //private
//		System.out.println(irma.facoDentroDeCasa); //default
		System.out.println(formaDeFalar); //por herdar Ana, não precisa criar objeto de Ana
		System.out.println(irma.todosSabem); //public
	}
}
