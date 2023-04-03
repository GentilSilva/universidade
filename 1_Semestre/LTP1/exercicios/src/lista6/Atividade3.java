package lista6;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int numero;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Este numero e par.");
		} else {
			System.out.println("Este numero e impar");
		}
		
		scan.close();
		
	}
	
}
