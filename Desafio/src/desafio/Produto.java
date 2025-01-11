package desafio;

public class Produto {

	static double desconto = 0.25;
	String nomeProduto;
	double preco;
	
	
	
	double aplicandoDesconto(double valor) {
		return (valor * desconto);
	}
}
