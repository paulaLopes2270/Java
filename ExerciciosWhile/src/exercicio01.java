
//LEIA UMA QUANTIDADE INDETERMINADA DE DUPLAS DE VALORES INTEIROS X E Y. eSCREVA PARA CADA X E Y 
//UMA MENSAGEM QUE INDIQUE SE ESSES VALORES FORAM DIGITADOS EM ORDEM CRESCENTE OU DECRESCENTE

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		while (num1 != num2) {
			if (num1 < num2) {
				System.out.println("Os números são crescentes");
			}

			else {
				System.out.println("Os números sào decrescentes");
			}

			num1 = sc.nextInt();
			num2 = sc.nextInt();

		}

		sc.close();
	}
}