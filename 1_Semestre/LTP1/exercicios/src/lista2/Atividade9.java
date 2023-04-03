package lista2;

import java.util.Scanner;

public class Atividade9 {

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
		
//		Realiza a divisão entre os dois números
		float divisao1 = numero1 / numero2;
		float divisao2 = numero2 / numero1;
		
//		Formata a mensagem para que o número imprimido tenha 4 casas decimais
		String mensagem = String.format("A divisao de num1 por num2 e: %.4f. \nA divisao de num2 por num1 e: %.4f.", divisao1, divisao2);
		
//		Imprime o resultado
		System.out.println(mensagem);
		
		scan.close();
		
	}
	
}