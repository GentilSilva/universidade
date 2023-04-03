package lista3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		double fahrenheit, celsius;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita entrada de dados para o usu�rio
		System.out.print("Digite a temperatura em Fahrenheit: ");
		fahrenheit = scan.nextDouble(); // L� e atribui o valor a vari�vel fahrenheit
		
		celsius = (fahrenheit - 32) / 1.8;
		
		String mensgasem = String.format("A temperatuda de %.2f F em celsius e: %.2f �C", fahrenheit, celsius);
		
		System.out.println(mensgasem);
		
		scan.close();
		
	}
	
}