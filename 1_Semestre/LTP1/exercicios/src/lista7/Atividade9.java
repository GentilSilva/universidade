package lista7;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		
		int numero;
		int triplo;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Digite um valor: ");
			numero = scan.nextInt();
			
			if(numero == 0) {
				System.out.println("Fim programa");
			} else {
				triplo = numero * 3;
				System.out.println("O triplo de " + numero + " e: " + triplo);
			}
			
		} while(numero != 0);
		
		scan.close();
		
	}
	
}

