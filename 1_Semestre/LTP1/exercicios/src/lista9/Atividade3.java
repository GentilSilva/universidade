package lista9;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		double[] arrReais = new double[10];
		double[] arrReaisQuadrado = new double[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arrReais.length; i++) {
			System.out.print("Digite um valor: ");
			arrReais[i] = scan.nextDouble();
			arrReaisQuadrado[i] = Math.pow(arrReais[i], 2);
		}
		
		for (double r : arrReaisQuadrado) {
			System.out.printf("[ %.2f ]", r);
		}
		
		System.out.println();
		
		for (double rq : arrReaisQuadrado) {
			System.out.printf("[ %.2f ]", rq);
		}
		
		scan.close();
		
	}
	
}
