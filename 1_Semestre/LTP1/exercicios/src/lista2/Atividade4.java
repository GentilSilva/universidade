package lista2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int usuario = 1;
		int numeroDeIrmaos;
		int numeroDeIrmas;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite a quantidade de irmaos que voce possui: ");
		numeroDeIrmaos = scan.nextInt();  // Lê e atribui o valor digitado na variável numeroDeIrmaos
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite a quantidade de irmas que voce possui: ");
		numeroDeIrmas = scan.nextInt();  // Lê e atribui o valor digitado na variável numeroDeIrmas
		
//		Faz a conta para de quantos filhos ao todo existem
		int somaDeIrmaos = usuario + numeroDeIrmaos + numeroDeIrmas;
		
//		Imprime o resultado
		System.out.println("Seus pais possuem " + somaDeIrmaos + " filhos.");
		
		scan.close();
		
	}
	
}