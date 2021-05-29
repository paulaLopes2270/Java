//Programa que lê números inteiros até que um zero seja lido. Ao final mostrar a soma dos números lidos.


package estruturarepetitivaWhile;

import java.util.Scanner;

//While=enquanto

public class While {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int soma = 0;
		while (numero != 0) {
			soma = soma + numero;
			numero = sc.nextInt();
			
		}
		
		System.out.println(soma);
		
		
		
		
		sc.close();
	}

}
