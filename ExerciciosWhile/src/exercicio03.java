import java.util.Scanner;

//ESCREVA UM PROGRAMA QUE REPITA A LEITURA DE UMA SENHA ATÉ QUE ELA SEJA VÁLIDA. PARA CADA 
//LEITURA DE SENHA INCORRETA INFORMADA, ESCREVA A MENSAGEM "SENHA INVALIDA". QUANDO A SENHA FOR
//INFORMADA CORRETAMENTE DEVE SER IMPRESSA A MENSAGEM "ACESSO PERMITIDO" E O ALGORITIMO ENCERRADO. 
//CONSIDERE QUE A SENHA CORRETA É O VALOR 2002.
public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int senha = sc.nextInt();

			if( senha != 2002) {
				System.out.println("Senha inválida");
				senha = sc.nextInt();
			}
			
			System.out.println("Acesso permitido!");
		
			
			
		
		sc.close();
	}

}
