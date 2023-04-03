package lista6;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		numero1 = scan.nextInt();
		System.out.print("Digite um valor para B: ");
		numero2 = scan.nextInt();
		
		if(numero1 % numero2 == 0) {
			System.out.println("O valor de A e divisivel pelo valor de B");
		} else {
			System.out.println("O valor de A nao e divisivel pelo valor B");
		}
		
		scan.close();
		
	}
	
}
