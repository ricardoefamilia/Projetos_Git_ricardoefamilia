package lambdas;

<<<<<<< HEAD
import java.util.function.Function;
import java.util.function.UnaryOperator;

=======
>>>>>>> a7c85e2749fe93f1600f86c2a9419e20db94a60c
public class Desafio {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		/*
		 * 1. A partir do produto calcullar o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (isento)
		 * 3. Frete: >= 3000 (100) < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */
		
		Function<Produto, Double> precoFinal = 
				prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				pl -> (pl >= 2500) ? pl * 1.085 : pl;
		UnaryOperator<Double> frete = 
				pi -> (pi >= 3000) ? pi + 100 : pi + 50;
		UnaryOperator<Double> arredondar = 
				pfa -> Double.parseDouble(String.format("%.2f", pfa));
		Function<Double, String> formatar = 
				pf -> ("R$" + pf).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);

		String preco  = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
		
		
		
=======
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto Municipal: >= 2500 98,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$1234,56
		 */
		
		

>>>>>>> a7c85e2749fe93f1600f86c2a9419e20db94a60c
	}

}
