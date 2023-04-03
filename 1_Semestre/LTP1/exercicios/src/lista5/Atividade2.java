package lista5;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero = scan.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("Este numero esta entre 0 e 10.");
		} else {
			System.out.println("Este numero nao esta entre 0 e 10");
		}
		
		scan.close();
		
	}
	
}
