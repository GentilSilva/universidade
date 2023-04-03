package lista9;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int[] arrNum = new int[10];
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arrNum.length; i++) {
			System.out.print("Digite um valor: ");
			arrNum[i] = scan.nextInt();
		}
		
		for (int i : arrNum) {
			if(i % 2 == 0) {
				contador += 1;
				System.out.printf("[ %d ]", i);
			}
		}
		
		System.out.println("\nA quantidade de n meros pares  : " + contador);
		
		scan.close();
		
	}
	
}
