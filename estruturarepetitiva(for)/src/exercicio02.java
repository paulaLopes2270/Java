import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				int numero = sc.nextInt();
				
				for (int i =1; i <= numero; i ++) {
					if (i % 2 !=0) {
						System.out.println(i);
					}
				}
				
		
		sc.close();

	}

}
