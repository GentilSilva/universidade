package lista2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int numeroInteiro;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite um numero inteiro: ");
		numeroInteiro = scan.nextInt();  // Lê e atribui o valor digitado na variável numeroInteiro
		
//		Realiza o calculo dos números antecessor e sucessor
		int numeroAntecessor = numeroInteiro - 1;
		int numeroSucessor = numeroInteiro + 1;
		
//		Imprime o resultado
		System.out.print("O numero digitado e: " + numeroInteiro + "\n" + " seu antecessor e: " + numeroAntecessor + "\n"
				+ " seu sucessor e: " + numeroSucessor);
		
		scan.close();
		
	}
	
}