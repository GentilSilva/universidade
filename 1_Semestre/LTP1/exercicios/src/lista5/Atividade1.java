package lista5;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int numero;
		int parOuImpar;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		parOuImpar = numero % 2;
		
		if(parOuImpar == 1) {
			System.out.println("O número digitado é ímpar");
		} else {
			System.out.println("O número digitado é par");
		}
		
		scan.close();
		
	}
}
