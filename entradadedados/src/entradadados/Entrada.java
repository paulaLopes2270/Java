package entradadados;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Cria��o de objeto tipo scanner.

		String x;
		x = sc.next();
		// Armazenar a palavra escrita
		System.out.println("Voc� digitou: " + x);

		sc.close();
		// Quando n�o precisar mais do objeto sc

		// Crt + Shift + F para identar
	}

}
