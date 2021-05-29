import java.util.Scanner;

//FAÇA UM PROGRAMA PARA LER UM NÚMERO INDETERMINADO DE DADOS, CONTENDO CADA UM, A IDAD3E DE UM
//INDIVIDUO. O ULTIMO DADO, QUE NÃO ENTRARÁ NOS CÁLCULOS, CONTÉM UM VALOR DE IDADE NEGATIVA. CALCULAR E
//IMPRIMIR A IDADE MEDIA DESTE GRUPO DE INDIVIDUOS. SE FOR ENTRANDO UM VALOR NEGATIVO NA PRIMEIRA VEZ
//MOSTRAR A MENSAGEM "IMPOSSIVEL CALCULAR"
public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0; 
		int cont = 0;
		
		while (idade >= 0) {
			//acumular soma das idades
			soma = soma + idade;
			//contar as idades que não são negativas
			cont = cont + 1;
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
			double media =(double) soma / cont;
			System.out.printf("%.2f%n",media);
		}
		else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();
	}

}
