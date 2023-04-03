package lista8;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int fator;
		int inicio, fim;
		int produto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a tabuada desejada: ");
		fator = scan.nextInt();
		System.out.print("Digite o inicio da tabuada: ");
		inicio = scan.nextInt();
		System.out.print("Digite o fim da tabuada: ");
		fim = scan.nextInt();
		
		for(int i = inicio; i <= fim; i++) {
			produto = i * fator;
			System.out.println(fator + " * " + i + " = " + produto);
		}
		
		scan.close();
		
	}
	
}
