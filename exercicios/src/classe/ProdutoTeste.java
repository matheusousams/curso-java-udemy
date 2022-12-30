package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laptop", 100.00); //tb pode ser usado 'var'
		System.out.println(p1.nome +"-"+ p1.preco);
		double precoFinal1 = p1.precoComDesconto();
		
		Produto p2 = new Produto(); //tb pode ser usado 'var'
		p2.nome="Mouse";
		p2.preco=100.00;
		Produto.desconto=0.5;
		System.out.println(p2.nome +"-"+ p2.preco);
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;		
		System.out.println(mediaCarrinho);
	}
}