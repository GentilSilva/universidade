package lista6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int numero1, numero2, temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		numero1 = scan.nextInt();
		System.out.print("Digite o valor de B: ");
		numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			temp = numero2;
			numero2 = numero1;
			numero1 = temp;
			System.out.println("A sequencia de numeros e A: " + numero1 + " e B: " + numero2);			
		} else {
			System.out.println("A sequencia de numeros e A: " + numero1 + " B: " + numero2);
		}
		
		scan.close();
		
	}
	
}

