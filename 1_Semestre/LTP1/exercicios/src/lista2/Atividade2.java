package lista2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dado pelo usuário
		System.out.print("Digite o valor do primeiro numero: ");
		numero1 = scan.nextInt();  // Lê e atribui o valor digitado pelo usuário na variável numero1
		
//		Solicita a entrada de dado pelo usuário
		System.out.print("Digite o valor do segundo numero: ");
		numero2 = scan.nextInt();  // Lê e atribui o valor digitado pelo usuário na variável numero2
		
//		Imprime o resultado
		System.out.print("Numero 1 = " + numero1 + "\n" + "Numero 2 = " + numero2);
		
		scan.close();
		
	}
	
}