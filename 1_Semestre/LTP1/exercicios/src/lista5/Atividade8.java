package lista5;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		double a, b, calculo;
		int escolha;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		a = scan.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = scan.nextDouble();
		
		System.out.print("Menu: \n"
				+ "Digite 1 para somar; \n"
				+ "Digite 2 para subtrair; \n"
				+ "Digite 3 para multiplicar; \n"
				+ "Digite 4 para dividir; \n"
				+ "Digite 5 para sair. \n"
				+ "Escolha: ");
		escolha = scan.nextInt();
		
		if(escolha == 1) {
			calculo = a + b;
			System.out.printf("a + b = %.2f", calculo);
		} else if(escolha == 2) {
			calculo = a - b;
			System.out.printf("a - b = %.2f", calculo);
		} else if(escolha == 3) {
			calculo = a * b;
			System.out.printf("a * b = %.2f", calculo);
		} else if(escolha == 4) {
			calculo = a / b;
			System.out.printf("a / b = %.2f", calculo);
		} else {
			System.out.println("Programa finalizado");
		}
		
		scan.close();
		
	}
}
