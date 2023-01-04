package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana cunhada = new Ana();
	
	void testeAcessos() {
//		System.out.println(cunhada.segredo); //private
//		System.out.println(cunhada.facoDentroDeCasa); //default
//		System.out.println(cunhada.formaDeFalar); //protected
		System.out.println(cunhada.todosSabem); //public
	} 
}
