package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		compra1.adicionarItem("Agulha", 5, 1.55);
		compra1.adicionarItem("Linha", 3, 2.90);
		compra1.adicionarItem("Tesoura", 2, 25.30);
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
		//para mostrar a relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).
				compra.getValorTotal();
		System.out.printf("Total: R$%.2f",total);
	}

}