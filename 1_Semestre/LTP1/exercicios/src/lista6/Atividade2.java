package lista6;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeor numero: ");
		numero1 = scan.nextInt();		
		System.out.print("Digite o valor do segundo numero: ");
		numero2 = scan.nextInt();
		
		if(numero1 != numero2) {
			System.out.println("Os numeros sao diferentes.");
		} else {
			System.out.println("Os numeros sao iguais.");
		}
		
		scan.close();
		
	}
	
}
