package lista6;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int numero;		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		numero = scan.nextInt();
		
		if(numero > 10) {
			System.out.println("O numero digitado e maior que 10");
		} else {
			System.out.println("O numero digitado nao e maior que 10");
		}
		
		scan.close();
		
	}
	
}
