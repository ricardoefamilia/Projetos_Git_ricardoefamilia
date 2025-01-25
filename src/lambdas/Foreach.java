package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		
		//foreach tradicional
		System.out.println("Forma tradicional de Foreach:");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("Foreach com Lambda");
		//foreach com lambda
		aprovados.forEach((nome) -> {
			System.out.println(nome);
		});
		
		//ou
		System.out.println("\nLambda - #1...");
		aprovados.forEach(nome -> System.out.println(nome));
		//ou method reference
		
		System.out.println("\nLambda - Method Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda - #2...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println();
		System.out.println("\nLambda - Method Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
