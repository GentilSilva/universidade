package lista9;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int[] arrNum = new int[6];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arrNum.length; i++) {
			System.out.print("Digite um valor: ");
			arrNum[i] = scan.nextInt();
		}
		
		for(int i : arrNum) {
			System.out.print("[" + i + "]");
		}
		
		scan.close();
		
	}
	
}
