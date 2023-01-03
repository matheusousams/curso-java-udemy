package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();			
		compra1.adicionarItem("Arroz", 2.0, 4);
		compra1.adicionarItem(2, new Produto("Feijão", 4));

		Compra compra2 = new Compra();			
		compra1.adicionarItem("Macarrão", 1.0, 2);
		compra1.adicionarItem(2, new Produto("Salsicha", 3.0));
		
		Cliente cliente = new Cliente("João José da Silva");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obteValorTotal());
	}
}
