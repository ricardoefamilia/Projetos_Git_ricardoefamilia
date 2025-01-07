package desafio;

public class ForBreaks {

	public static void main(String[] args) {
		// Break para laço interno e break rotulado para laço externo.
		externo: for (int i = 0; i <= 4; i++) {
			for(int y = 0; y<=2; y++) {
				if(y==2) {
					System.out.printf("i= %d, y= %d", i, y);
					break externo;
				}
			}
		}
		
	}

}
