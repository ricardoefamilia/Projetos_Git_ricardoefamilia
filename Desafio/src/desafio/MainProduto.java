package desafio;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.nomeProduto = "Camisa Pólo";
		p.preco = 100.00;
		double desconto = p.aplicandoDesconto(100.00);
		System.out.printf("Produto: %s, \nPreço: %.2f, \nDesconto: %.2f,\nPreço final: %.2f", p.nomeProduto, p.preco, desconto, (p.preco - desconto));
		
	}

}
