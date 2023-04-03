package lista10;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int[][] arrMaiorIndice = new int[4][4];
		int maiorValor = arrMaiorIndice[0][0];
		int maiorIndiceLinha = 0;
		int maiorIndiceColuna = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("Digite um valor:");
				arrMaiorIndice[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(maiorValor < arrMaiorIndice[i][j]) {
					maiorValor = arrMaiorIndice[i][j];
					maiorIndiceLinha = i;
					maiorIndiceColuna = j;
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 4; j++) {
				mensagem += arrMaiorIndice[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
		System.out.printf("O maior valor é %d e ele se encontra na linha %d e coluna %d .", maiorValor, maiorIndiceLinha, maiorIndiceColuna);
		
		scan.close();
		
	}
	
}
