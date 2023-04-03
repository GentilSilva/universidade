package lista7;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		
		int numero;
		double soma = 0;
		double media;
		int somatorio = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Digite um valor: ");
			numero = scan.nextInt();
			
			if(numero < 0) {
				System.out.println("Fim do programa");
			} else {
				soma += numero;
				somatorio += 1;
			}
			
		} while (numero > 0);
		
		media = soma / somatorio;
		
		System.out.printf("A m�dia dos valores digitados �: %.2f ", media);
		
		scan.close();
		
	}
	
}

