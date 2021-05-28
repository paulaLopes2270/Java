package entradadados;

import java.util.Scanner;

public class EntradaQuebraLinha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		String nome, sobrenome, rua;

		
		x= sc.nextInt();
		sc.nextLine();
		//nextLine extra por causa do nextInt
		nome = sc.nextLine();
		//Ler a linha intera até clicar em Enter
		sobrenome = sc.nextLine();
		rua = sc.nextLine();
		

		System.out.println("DADOS DIGITADOS");
		System.out.println("O número inteiro é: " + x);
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Rua: " + rua);

		sc.close();

	}

}
