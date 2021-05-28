package SwitchCase;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		String dia;

		if (numero == 1) {
			dia = "domingo";
		} else if (numero == 2) {
			dia = "segunda";
		} else if (numero == 3) {
			dia = "terça";
		} else if (numero == 4) {
			dia = "quarta";
		} else if (numero == 5) {
			dia = "quinta";
		} else if (numero == 6) {
			dia = "sexta";
		} else if (numero == 7) {
			dia = "sábado";
		} else {
			dia = "Valor inválido";
		}

		System.out.println("Dia da semana: " + dia);
		
		sc.close();

	}

}
