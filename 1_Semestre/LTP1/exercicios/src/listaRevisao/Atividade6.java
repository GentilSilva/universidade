package listaRevisao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int[][] arrNumeros = new int[3][3];
		int somatoria = 0;
		Scanner scan = new Scanner(System.in);
		
//		Preenche matriz
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Digite um valor: ");
				arrNumeros[i][j] = scan.nextInt();
			}
		}
		
//		Faz a somatória dos elementos da diagonal principal
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					somatoria += arrNumeros[i][j];
				}
			}
		}
		
//		Imprime matriz
		System.out.println();
		for(int i = 0; i < 3; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 3; j++) {
				mensagem += arrNumeros[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
//		Imprime a soma da diagonal principal
		System.out.println();
		System.out.printf("A soma dos elementos da diagonal superior é: %d.", somatoria);
		
		scan.close();
		
	}
	
}
