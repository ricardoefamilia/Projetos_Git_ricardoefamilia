package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		//percorrendo o array com foreach
		for (double d : notasAlunoA) {
			totalA += d;
		}
		System.out.printf("Média: %.2f\n\n",(totalA/3));
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.printf("Média: %.2f",(totalB/notasAlunoB.length));
		
		
	}

}
