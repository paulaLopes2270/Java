package funcao;

import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os três números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if ( num1 > num2 && num1 > num3) {
			System.out.println("Maior: " + num1);
		}
		
		else if (num2 > num3) {
			System.out.println("Maior: " + num2);
		}
		
		else {
			System.out.println("Maior: " + num3);
		}
		
		
		sc.close();

	}

}
