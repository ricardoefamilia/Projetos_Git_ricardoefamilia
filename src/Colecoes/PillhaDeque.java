package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class PillhaDeque {

	//Pilha - Lifo: último a entrar é o primeiro a sair
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Deque - pilha
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O Pequeno Príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		for (String l : livros) {
			System.out.println(l);
		}
		System.out.println();
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println();
		//poll,remove e pop: retiram elementos da pilha, 
		//sendo pull return null, pop e remove return Exception erro.
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
		
		//livros.size()
		//livros.contains()
		//livros.clear()
		//livros.isEmpty()
		

	}

}
