package lista2;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		double ladoQuadrado;
		double areaQuadrado;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do lado do quadrado: ");
		ladoQuadrado = scan.nextDouble();  // Lê e atribui o valor digitado na variável ladoQuadrado
		
//		Calula a área do quadradro
		areaQuadrado = Math.pow(ladoQuadrado, 2);
		
//		Imprime o resultado
		System.out.println("A area do quadrado e de: " + areaQuadrado + "m quadrados.");
		
		scan.close();
		
	}
	
}