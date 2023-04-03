package lista5;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		double media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite o valor da segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite o valor da terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 6) {
			System.out.printf("Aluno aprovado com media: %.2f", media);
		} else {
			System.out.printf("Aluno reprovado com media: %.2f ", media);
		}
		
		scan.close();
		
	}
}