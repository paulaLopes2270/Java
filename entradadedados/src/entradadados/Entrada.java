package entradadados;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Criação de objeto tipo scanner.

		String x;
		x = sc.next();
		// Armazenar a palavra escrita
		System.out.println("Você digitou: " + x);

		sc.close();
		// Quando não precisar mais do objeto sc

		// Crt + Shift + F para identar
	}

}
