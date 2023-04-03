package lista2;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do numero 1: ");
		num1 = scan.nextInt();  // Lê e atribui o valor digitado na variável num1
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do numero 2: ");
		num2 = scan.nextInt();  // Lê e atribui o valor digitado na variável num2
		
//		Faz a soma do número 1 com o número 2
		int soma = num1 + num2;
		
//		Imprime o resultado
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma);
		
		scan.close();
		
	}
	
}