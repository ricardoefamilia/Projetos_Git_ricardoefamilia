package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {
		// Array multidimensional
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		System.out.println("Qtd de Alunos: " + qtdeAlunos);
		System.out.println("Qtd de notas por aluno: " + qtdeNotas);
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno  %d: "
						, j+1, i+1);
				notasDaTurma[i][j] = (double) entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println();
		System.out.printf("Média da turma: %.2f\n", media);
		
		for (double[] ds : notasDaTurma) {
			System.out.println(Arrays.toString(ds));
		}
		
		entrada.close();
	}

}
