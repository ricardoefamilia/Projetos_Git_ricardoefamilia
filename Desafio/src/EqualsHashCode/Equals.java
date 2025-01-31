package EqualsHashCode;

public class Equals {

	public static void main(String[] args) {
		//igualdade entre objetos: result false - compara endereços de memória
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@gmail.com";
		
		System.out.println(u1 == u2);
		//usando métodos equals e hasCode da class Usuario gerados pelo eclipse é possível: true
		System.out.println(u1.equals(u2));
		
		//comparação de conteúdos pode resultar true
		System.out.println(u1.nome.equals(u2.nome));
		
	}

}
