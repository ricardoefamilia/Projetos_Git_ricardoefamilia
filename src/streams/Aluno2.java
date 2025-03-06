package streams;

public class Aluno2 {

	final String nome;
	final double nota;
	final boolean bomComportamento;
	
	public Aluno2(String nome, double nota) {
		this(nome,nota,true);
	}
	
	public Aluno2(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
}
