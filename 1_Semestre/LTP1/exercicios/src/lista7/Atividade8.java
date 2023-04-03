package lista7;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		int quantidadeNumeros;
		int numero;
		double soma = 0;
		double media;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor que sera a quantidade de repeticao: ");
		quantidadeNumeros = scan.nextInt();
		
		for(int i = 0; i < quantidadeNumeros; i++) {
			System.out.print("Digite um valor: ");
			numero = scan.nextInt();
			soma += numero;
		}
		
		media = soma / quantidadeNumeros;
		System.out.println("A media e igual: " + media);
		
		scan.close();
		
	}
	
}

