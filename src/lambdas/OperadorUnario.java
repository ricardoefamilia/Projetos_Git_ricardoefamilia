package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//andThen segue a ordem direta até o último andThen antes do apply
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado1);
		
		//compose faz a ordem inversa - do último para o primeiro
		int resultado2 = maisDois
				.compose(vezesDois)
				.compose(aoQuadrado)
				.apply(0);
		
		System.out.println(resultado2);
		
	}

}
