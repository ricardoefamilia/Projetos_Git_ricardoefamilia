package DesafioComida;

public class Pessoa {
	
	String nome;
	double peso;
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	
	String apresentacao() {
		return this.nome + ": "+peso+" kg";
	}
}
