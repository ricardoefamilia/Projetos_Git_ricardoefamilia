package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//HashSet: Lista não ordenada
//		Set<String> listaAprovados = new HashSet<String>();
		//TreeSet: Lista ordenada
		//SortedSet: possui ordenação
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(8);
		nums.add(3);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
