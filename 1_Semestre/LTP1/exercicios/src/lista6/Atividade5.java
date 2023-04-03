package lista6;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro numero: ");
		numero1 = scan.nextInt();
		System.out.print("Digite o valor do segundo numero: ");
		numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior numero e: " + numero1);

		} else {
			System.out.println("O maior numero e: " + numero2);
		}
		
		scan.close();
		
	}
	
}
