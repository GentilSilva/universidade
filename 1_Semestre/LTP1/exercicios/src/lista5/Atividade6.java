package lista5;

import java.util.Scanner;

public class Atividade6 {

	
	public static void main(String[] args) {
		
		double peso;
		double altura;
		double imc;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu peso: ");
		peso = scan.nextDouble();
		System.out.print("Digite a sua altura: ");
		altura = scan.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if(imc < 18.5) {
			System.out.printf("Magreza - IMC: %.2f", imc);
		} else if(imc >= 18.5 && imc <= 24.9) {
			System.out.printf("Normal - IMC: %.2f", imc);
		} else if(imc >= 25 && imc <= 29.9) {
			System.out.printf("Sobrepeso - IMC: %.2f", imc);
		} else if(imc >= 30 && imc <= 39.9) {
			System.out.printf("Obesidade - IMC: %.2f", imc);
		} else {
			System.out.printf("Obesidade grave - IMC: %.2f", imc);
		}
		
		scan.close();
		
	}
}