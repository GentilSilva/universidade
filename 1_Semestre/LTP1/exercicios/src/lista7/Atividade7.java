package lista7;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int par = 0;
		int impar = 0;
		int valor;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Digite um valor: ");
			valor = scan.nextInt();
			if(valor % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
		}
		System.out.println("A quantidade de n�meros pares e: " + par);
		System.out.println("A quantidade de n�meros impares e: " + impar);
		
		scan.close();
		
	}
}

