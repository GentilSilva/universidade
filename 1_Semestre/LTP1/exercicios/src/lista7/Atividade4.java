package lista7;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int n, x;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		x = scan.nextInt();
		System.out.print("Digite o valor de n: ");
		n = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(i % n == 0) {
				String mensagem = String.format("O n�mero %d e divisivel por %d", i, n);
				System.out.println(mensagem);
			}
		}
	
		scan.close();
		
	}
	
}

