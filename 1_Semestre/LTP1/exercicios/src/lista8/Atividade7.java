package lista8;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int soma = 0;
		int opcao, valor;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Menu: \n"
			+ "1 - Somar valores \n"
			+ "2 - Para encerrar o programa \n"
			+ "Digite: ");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite o valor a ser somado: ");
				valor = scan.nextInt();
				
				soma += valor;
			}
			
		} while(opcao != 2);
		
		System.out.println("A soma dos valores e: " + soma);
		
		scan.close();
		
	}
	
}
