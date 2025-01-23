package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingred1 = new Arroz(0.2);
		Feijao ingred2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingred1);
		convidado.comer(ingred2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.printf("Peso: %.2f",convidado.getPeso());

	}

}
