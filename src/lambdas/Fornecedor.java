package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//Supplier - tipo de interface funcional que não recebe nenhum parâmetro 
		//() sempre deve ser colocado quando não recebe nenhum parâmetro ou quando recebe mais de um parâmetro
		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ama", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());

		
	}

}
