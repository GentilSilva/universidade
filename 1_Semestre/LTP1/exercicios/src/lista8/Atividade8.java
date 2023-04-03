package lista8;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		double soma = 0;
		int opcao, idade;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Menu: \n"
			+ "1 - Informar idade \n"
			+ "2 - Para encerrar o programa \n"
			+ "Digite: ");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite a idade: ");
				idade = scan.nextInt();
				if(idade >= 18) {
					soma += idade;
					contador++;
				}
			}
			
		} while(opcao != 2);
		
		double media = soma / contador;
		
		System.out.println("A media dos valores das pessoas de maior idade e: " + media);
		
		scan.close();
		
	}
	
}
