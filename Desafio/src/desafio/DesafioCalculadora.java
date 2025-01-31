package desafio;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o 1o numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("Entre com o 2o numero: ");
		double num2 = entrada.nextDouble();
		System.out.println("Escolha uma das operações: +, -, *, / ");
		String op = entrada.next();
		String resp = "";
		double rs = 0.00;
		switch (op) {
		case "+":
			rs = num1 + num2;
			resp = "Adição: " + rs;
			break;
		case "-":
			rs = num1 - num2;
			resp = "Subtração: " + rs;
			break;
		case "*":
			rs = num1 * num2;
			resp = "Multiplicação: " + rs;
			break;
		case "/":
			if (num2 == 0) {
				resp = "Divisão impossível";
				break;
			} else {
				rs = num1 / num2;
				resp = "Divisão: " + rs;
				break;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		System.out.println(resp);
		entrada.close();
	}

}
