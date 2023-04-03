package lista10;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int[][] arrNumeros = new int[5][5];
		int valorProcurado = 0;
		boolean encontrou = false;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("Digite um valor:");
				arrNumeros[i][j] = scan.nextInt();
			}
		}
		
		System.out.print("\nAgora digite o valor que deseja encontrar na matriz: ");
		valorProcurado = scan.nextInt();
		
		System.out.println("\nA matriz digiada: ");
		for(int i = 0; i < 5; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 5; j++) {
				mensagem += arrNumeros[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(valorProcurado == arrNumeros[i][j]) {
					System.out.printf("O valor procurado se encontra na linha %d e coluna %d .", i, j);
					encontrou = true;
				}
			}
		}
		
		if(encontrou != true) {
			System.out.print("Valor não encontrado");
		}
	
		scan.close();
		
	}
	
}
