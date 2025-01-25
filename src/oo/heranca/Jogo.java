package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10,20);
		Heroi heroi = new Heroi(10,21); //exemplo de herança
//		
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		
//		j1.andar(Direcao.NORTE);
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		j1.andar(Direcao.OESTE);
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		j1.andar(Direcao.OESTE);
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		j1.andar(Direcao.SUL);
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		j1.andar(Direcao.LESTE);
//		System.out.println("["+j1.x + ","+ j1.y+"]");
//		j1.andar(Direcao.NORTE);
//		
//		System.out.println("["+j1.x + ","+ j1.y+"]");
		
		System.out.println("Monstro: " + monstro.vida + " v");
		System.out.println("Heroi:" + heroi.vida + " v");
		
		monstro.atacar(heroi);
		heroi.andar(Direcao.NORTE);
		System.out.println("Monstro: " + monstro.vida + " v");
		System.out.println("Heroi:" + heroi.vida + " v");
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		
		System.out.println("Monstro: " + monstro.vida + " v");
		System.out.println("Heroi:" + heroi.vida + " v");
		heroi.atacar(monstro);
		System.out.println("Monstro: " + monstro.vida + " v");
		System.out.println("Heroi:" + heroi.vida + " v");
		heroi.atacar(monstro);
		System.out.println("Monstro: " + monstro.vida + " v");
		System.out.println("Heroi:" + heroi.vida + " v");
		
	}

}
