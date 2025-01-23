package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro();
		System.out.println(cao1.mover());
		System.out.println(cao1.mamar());
		System.out.println(cao1.respirar());

	}

}
