package lista7;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int inicio;
		int fim;
		int somatorio = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor inicial: ");
		inicio = scan.nextInt();
		System.out.print("Digite o valor final: ");
		fim = scan.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				somatorio += i;
			}
		}
		System.out.println(somatorio);
	
		scan.close();
	}
	
}

