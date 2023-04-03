package lista2;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		float numero1;
		float numero2;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do numero 1: ");
		numero1 = scan.nextFloat();  // Lê e atribui o valor digitado na variável numero1
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do numero 2: ");
		numero2 = scan.nextFloat();  // Lê e atribui o valor digitado na variável numero2
		
//		Realiza  a divisão entro os dois números
		float divisao = numero1 / numero2;
		
//		Formata a mensagem para que o número imprimido tenha 1 casa decimal
		String mensagem = String.format("A divisao entre os dois numeros e: %.1f", divisao);
		
//		Imprime o resultado
		System.out.println(mensagem);
		
		scan.close();
		
	}
	
}