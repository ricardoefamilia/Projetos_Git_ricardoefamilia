package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//cast direto não é permitido - int -> Double
		
		//exemplo de função lambda no lugar da classe Soma
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };

		//executanto a função soma criada
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x,y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
		
		//exemplo de função lambda no lugar da classe Soma
		BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
		
		//executanto a função soma criada
		System.out.println(calc2.apply(2, 3));
		
		calc2 = (x,y) -> x * y;
		System.out.println(calc2.apply(2, 3));
		
		
	}

}
