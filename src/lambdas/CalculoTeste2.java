package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//exemplo de função lambda no lugar da classe Soma
		Calculo calc = (x, y) -> { return x + y; };

		//executanto a função soma criada
		System.out.println(calc.executar(2, 3));
		
		calc = (x,y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		
	}

}
