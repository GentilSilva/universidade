package lista7;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int maior = 0;
		int menor = 0;		
		int valor;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			valor = scan.nextInt();
			
			if(i == 0) {
				valor = menor;
			} else if(valor > maior) {
				maior = valor;
			} else if(valor < menor) {
				menor = valor;
			}
		}
		
		System.out.println("O menor valor e: " + menor);
		System.out.println("O maior valor e: " + maior);
		
		scan.close();
		
	}
	
}

