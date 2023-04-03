package lista9;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		double[] arrNum = new double[10];
		double maiorValor = 0;
		double menorValor = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arrNum.length; i++) {
			System.out.print("Digite um valor: ");
			arrNum[i] = scan.nextDouble();
		}
		
		for(int i = 0; i < arrNum.length; i++) {
			if(i == 0) {
				menorValor = arrNum[i];
			} else if (arrNum[i] > maiorValor) {
				maiorValor = arrNum[i];
			} else if (arrNum[i] < menorValor) {
				menorValor = arrNum[i];
			}
		}
		
		System.out.println("O maior valor  : " + maiorValor);
		System.out.println("O menor valor  : " + menorValor);
		
		
		scan.close();
		
	}
	
}
