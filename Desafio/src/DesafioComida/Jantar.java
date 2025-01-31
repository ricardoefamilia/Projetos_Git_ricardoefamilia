package DesafioComida;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		p.nome = "Ricardo";
		p.peso = 80;
		System.out.println(p.apresentacao());
		Comida c1 = new Comida("Arroz com feijão", 0.5);
		p.comer(c1);
		System.out.println(p.apresentacao());
		Comida c2 = new Comida("Bife com batatas fritas", 0.3);
		p.comer(c2);
		System.out.println(p.apresentacao());
		Comida c3 = new Comida("Pudim de leite", 0.4);
		p.comer(c3);
		System.out.println(p.apresentacao());
	}
}
