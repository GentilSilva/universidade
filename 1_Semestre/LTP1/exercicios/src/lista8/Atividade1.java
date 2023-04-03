package lista8;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int fator;
		int produto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a tabuada desejada: ");
		fator = scan.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			produto = i * fator;
			System.out.println(fator + " * " + i + " = " + produto);
		}
		
		scan.close();
		
	}
	
}
