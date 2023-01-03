package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();			
		compra1.adicionarItem("Arroz", 2.0, 4);
		compra1.adicionarItem(2, new Produto("Feij�o", 4));

		Compra compra2 = new Compra();			
		compra1.adicionarItem("Macarr�o", 1.0, 2);
		compra1.adicionarItem(2, new Produto("Salsicha", 3.0));
		
		Cliente cliente = new Cliente("Jo�o Jos� da Silva");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obteValorTotal());
	}
}
