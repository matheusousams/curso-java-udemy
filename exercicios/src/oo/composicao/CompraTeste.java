package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Sana";
		compra1.adicionarItem("Camiseta", 20, 7.45);
		compra1.adicionarItem(new Item("Cal�a", 12, 3.89));
		compra1.adicionarItem(new Item("T�nis", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// S� pra mostrar a rela��o bidirecional!!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total � R$" + total);
	}
}
