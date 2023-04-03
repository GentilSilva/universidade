package lista10;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int[][] arrNumerosUm = new int[4][4];
		int[][] arrNumerosDois = new int[4][4];
		int[][] arrNumerosResultante = new int[4][4];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Preencheremos a primeira matriz agora.");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um valor para a primeira matriz: ");
				arrNumerosUm[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\nPreencheremos a segunda matriz agora.");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um valor para a segunda matriz: ");
				arrNumerosDois[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arrNumerosUm[i][j] > arrNumerosDois[i][j]) {
					arrNumerosResultante[i][j] = arrNumerosUm[i][j];
				} else {
					arrNumerosResultante[i][j] = arrNumerosDois[i][j];
				}
			}
		}
		
		System.out.println("Primeira Matriz:");
		for(int i = 0; i < 4; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 4; j++) {
				mensagem += arrNumerosUm[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
		System.out.println("Segunda Matriz:");
		for(int i = 0; i < 4; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 4; j++) {
				mensagem += arrNumerosDois[i][j] + " ";
			}
			System.out.println(mensagem + "|");

		}
		
		System.out.println("Terceira Matriz:");
		for(int i = 0; i < 4; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 4; j++) {
				mensagem += arrNumerosResultante[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
		scan.close();
		
	}
	
}
