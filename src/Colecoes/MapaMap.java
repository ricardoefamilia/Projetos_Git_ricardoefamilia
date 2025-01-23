package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapaMap {

	public static void main(String[] args) {
		//Map: estrutura com chave e valor
		Map<Integer, String> usuarios = new HashMap<>();
		//put - para add ou atualizar (insert/update)
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Ricardo");
		usuarios.put(3, "Carlos");
		usuarios.put(4, "Mônica");
		usuarios.put(2, "Rebeca");
		usuarios.put(20, "Pedro");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		//usuarios.containsKey() - contém chave
		//usuarios.containsValue() - contém valor (conteúdo completo)
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Ricado"));
		
		//usuarios.get() - retorna a chave
		System.out.println(usuarios.get(20));
		
		for (Integer key : usuarios.keySet()) {
			System.out.println(key);
		}
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		//EntrySet - percorre a chave e o valor
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey()+"- "+registro.getValue());
		}
		
	}

}
