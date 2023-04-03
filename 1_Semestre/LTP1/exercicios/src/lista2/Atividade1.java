package lista2;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		String nomeUsuario;
		int repeticao = 5;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o nome do usuario: ");
		nomeUsuario = scan.nextLine();  // lê e atribui o nome digitado na variável nomeUsuario
		
//		Laço de repetição para imprimir a variável nomeUsuario pela quantidade de repeticao
		for(int i = 0; i < repeticao; i++) {
			System.out.println(nomeUsuario);
		}
		
		scan.close();
		
	}
	
}