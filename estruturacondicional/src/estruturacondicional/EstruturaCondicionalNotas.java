package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();

		double notaFinal = nota1 + nota2;

		if (notaFinal < 6) {
			System.out.println("Voc� foi reprovado! Sua nota final �: " + notaFinal);
		} else if (notaFinal >= 6) {
			System.out.println("Parab�ns! voc� foi aprovado. Sua nota final �: " + notaFinal);

		}

		entrada.close();
	}

}
