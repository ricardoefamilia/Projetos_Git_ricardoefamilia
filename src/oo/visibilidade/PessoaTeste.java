package oo.visibilidade;

public class PessoaTeste {

	public static void main(String[] args) {
		//teste
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Márcio");
		p1.setSobrenome("Ferreira de Almeida");
		p1.setIdade(53);
		p1.setAdmitida(true);
		p1.setAltura(1.78);
		p1.setPeso(85);

		System.out.println("Nome Completo: "+p1.getNomeCompleto());
		System.out.println("Idade: "+p1.getIdade());
		System.out.println("Admitida: "+(p1.isAdmitida() ? "Sim" : "Não"));
		System.out.println("Altura: "+p1.getAltura());
		System.out.println("Peso: "+p1.getPeso());
		System.out.printf("\nIMC: %.2f",(p1.imc()));
		
		
	}

}
