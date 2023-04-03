package lista2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		String nomeUsuario;
		String nomePai;
		String nomeMae;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o nome do usuario: ");
		nomeUsuario = scan.nextLine();  // Lê e grava o nome digitado na variável nomeUsuario
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o nome do pai do usuario: ");
		nomePai = scan.nextLine();  // Lê e grava o nome digitado na variável nomePai
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o nome da mae do usuario: ");
		nomeMae = scan.nextLine();  // Lê e grava o nome digitado na variável nomeMae
		
//		Imprime o resultado
		System.out.println(nomeUsuario + ", voce e filho de " + nomePai + " e " + nomeMae);
		
		scan.close();
		
	}
	
}