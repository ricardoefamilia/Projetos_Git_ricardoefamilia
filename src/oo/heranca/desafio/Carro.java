package oo.heranca.desafio;

public class Carro {

	public final int VELOC_MAX;
	private int delta = 5;
	protected int gama = 8;
	int velocAtual;
	
	protected Carro(int velocMax) {
		VELOC_MAX = velocMax;
	}
	
	void acelerar() {
		if(velocAtual + getDelta() > VELOC_MAX) {
			velocAtual = VELOC_MAX;
		}else {			
			velocAtual += getDelta();
		}
	}
	void frear() {
		if(velocAtual >= gama) {
			velocAtual -= gama;
		}else {
			velocAtual = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
