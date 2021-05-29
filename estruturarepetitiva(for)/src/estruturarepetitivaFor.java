import java.util.Scanner;

//FAZER UM PROGRAMA QUE LÊ UM VALOR INTEIRO n E DEPOIS N NÚMEROS INTEIROS.
//AO FINAL, MOSTRA A SOMA DOS NUMEROS LIDOS
public class estruturarepetitivaFor {

	public static void main(String[] args) {
		// FOR (INICIO ; CONDICAO ; INCREMENTO) {
		// COMANDO 1
		// COMANDO 2 }
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < numero; i = i + 1) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);

		sc.close();
	}

}
