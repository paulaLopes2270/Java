package SwitchCase;

import java.util.Scanner;

public class SwicthCaseFeito {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "Valor inválido";
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();
	}

}
