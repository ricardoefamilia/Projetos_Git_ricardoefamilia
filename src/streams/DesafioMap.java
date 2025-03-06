package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro... "011" => 3
		 */
		
		//1. Número para String binária - Integer::toBinaryString
		//2. Inverter a string - StringBuilder().reverse()
		UnaryOperator<String> invertido = 
				s -> new StringBuilder(s).reverse().toString();
		//3. Converter de volta para inteiro - Integer.parseInt(s,2) (o 2 indica que a string é binária)
		Function<String, Integer> inteiro = 
				s -> Integer.parseInt(s, 2);
		
		System.out.println("\n\nUsando composição...");
		nums.stream()
		.map(Integer::toBinaryString)
		.map(invertido)
		.map(inteiro)
		.forEach(System.out::println);
		
	}

}
