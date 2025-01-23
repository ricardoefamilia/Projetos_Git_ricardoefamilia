package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		//Lista
		ArrayList<Usuario> lista = new ArrayList<>();
		//duas formas de add
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		//imprimindo com metodo toString no Usuario
		System.out.println(lista.get(3));
		
		for (Usuario u : lista) {
			System.out.println(u);
		}
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Feliciano")));
		System.out.println("Contém Lia? " + lista.contains(new Usuario("Lia")));
		for (Usuario u : lista) {
			System.out.println(u);
		}
		
	}

}
