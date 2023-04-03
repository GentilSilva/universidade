package lista5;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scan.nextInt();		
		System.out.print("Digite o segundo numero: ");
		num2 = scan.nextInt();		
		System.out.print("Digite o terceiro numero: ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior numero e o primeiro numero - " + num1);
		} else if(num2 > num1 && num2 > num3){
			System.out.println("O maior numero e o segundo numero - " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O maior numero e o terceiro numero - " + num3);
		}

		scan.close();
		
	}
}