package lista4;

import java.util.Scanner;

public class Atividade3b {

	public static void main(String[] args) {
		
		int valorFahrenheit, valorCelsius;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita entrada de dados pelo usu�rio
		System.out.print("Digite o valor em graus Fahrenheit: ");
		valorFahrenheit = scan.nextInt(); // L� e atribui o valor digitado na vari�vel valorFehrenheit
		
//		Calcula o valor em celsius
		valorCelsius = ((valorFahrenheit - 32) * (5/9));
		
//		Imprime o valor em celsius
		System.out.printf("O valor em celsius �: %d �C", valorCelsius);
		
		scan.close();
		
	}
	
}