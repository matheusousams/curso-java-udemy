package oo.encapsulamento.casaA;

public class Paulo {

	Ana mae = new Ana();
	
	void testeAcessos() {
//		System.out.println(mae.segredo); //private
		System.out.println(mae.facoDentroDeCasa); //default
		System.out.println(mae.formaDeFalar); //protected
		System.out.println(mae.todosSabem); //public
	}
}
