package lista7;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		numero = scan.nextInt();
		
		for(int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				String mensagem = String.format("O valor %d e dividido por: %d", numero, i);
				System.out.println(mensagem);
			}
		}
		
		scan.close();
		
	}
	
}

