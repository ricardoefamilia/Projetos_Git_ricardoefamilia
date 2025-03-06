package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Câmera Nokia", 450, 0.15, 0);
		Produto p2 = new Produto("Aspirador de ar", 650, 0.35, 0);
		Produto p3 = new Produto("Fone de ouvido", 150, 0.30, 20);
		Produto p4 = new Produto("Celular Samsung", 950, 0.33, 0);
		Produto p5 = new Produto("Celular Motorola", 1150, 0.15, 30);
		Produto p6 = new Produto("TV 4k 55 pol", 2450, 0.25, 40);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto> promocao = p-> p.desconto >= 0.3; 
		Predicate<Produto> freteGratis = p-> p.frete == 0; 
		Predicate<Produto> precoRelevante = p-> p.preco > 700; 
		
		produtos.stream()
		.filter(promocao)
		.filter(freteGratis)
		.filter(precoRelevante)
		.map(p -> p.nome + " R$ " 
				+ p.preco 
				+ " Preço Final R$ " 
				+  (p.preco * (1 - p.desconto) + p.frete))
		.forEach(System.out::println);

	}

}
