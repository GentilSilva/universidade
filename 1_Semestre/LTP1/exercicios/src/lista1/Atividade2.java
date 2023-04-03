package lista1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		double base;
		double altura;
		double area;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do retangulo: ");
		base = scan.nextDouble();
		System.out.print("Digite o valor da altura do retangulo: ");
		altura = scan.nextDouble();
		
		area = base * altura;
		
		System.out.println("Para um triangulo de base " + base + " e altura: " + altura + " a area e de valor: "
				+ area + " metros quadrado");
		
		scan.close();
		
	}
	
}