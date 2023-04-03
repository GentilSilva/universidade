package lista10;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		 int[][] contaValores = new int[4][4];
		 int contador = 0;
		 Scanner scan = new Scanner(System.in);
		 
		 for(int i = 0; i < 4; i ++) {
			 for(int j = 0; j < 4; j++) {
				 System.out.print("Digite um valor: ");
				 contaValores[i][j] = scan.nextInt();
				 if(contaValores[i][j] > 10) {
					 contador++;
				 }
			 }
		 }
		 
		 System.out.println("A quantidade de números maiores que 10 e: " + contador);
		 scan.close();
	}
	
}
