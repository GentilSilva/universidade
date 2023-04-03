package listaRevisao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int[] vetNumeros = new int[6];
		Scanner scan = new Scanner(System.in);
		
//		Preenche vetor
		for(int i = 0; i < 6; i++) {
			System.out.print("Digite um valor: ");
			vetNumeros[i] = scan.nextInt();
		}
		
//		Imprime vetor
		System.out.println();
		String mensagem = "| ";
		for(int i = 5; i >= 0; i--) {
			mensagem += vetNumeros[i] + " ";
		}
		System.out.println(mensagem + "|");
		
		scan.close();
		
	}
	
}
