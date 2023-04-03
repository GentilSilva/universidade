package lista8;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		
		double total = 0;
		double faixa1 = 0;
		double faixa2 = 0;
		double faixa3 = 0;
		double faixa4 = 0;
		double faixa5 = 0;
		int opcao, idade;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Menu: \n"
			+ "1 - Informar idade \n"
			+ "2 - Para encerrar o programa \n"
			+ "Digite: ");
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				System.out.print("Digite a idade: ");
				idade = scan.nextInt();
				if(idade <= 17) {
					total++;
					faixa1++;
				} else if(idade <= 35) {
					total++;
					faixa2++;
				} else if(idade <= 50) {
					total++;
					faixa3++;
				} else if(idade <= 65) {
					total++;
					faixa4++;
				} else {
					total++;
					faixa5++;
				}
			} else if(opcao > 2){
				System.out.println("Opcao invalida");
			}
			
		} while(opcao != 2);
		
		faixa1 = faixa1 * 100 / total;
		faixa2 = faixa2 * 100 / total;
		faixa3 = faixa3 * 100 / total;
		faixa4 = faixa4 * 100 / total;
		faixa5 = faixa5 * 100 / total;
		
		String mensagem = String.format("A porcentagem de pessoas com idade ate 17 anos e: %.2f \n"
				+ "A porcentagem de pessoas entre 18 e 35 anos e: %.2f \n"
				+ "A porcentagem de pessoas entre 36 e 50 anos e: %.2f \n"
				+ "A porcentagem de pessoas entre 51 e 65 anos e: %.2f \n"
				+ "A porcentagem de pessoas com mais de 65 anos e: %.2f", faixa1, faixa2, faixa3, faixa4, faixa5);
		
		System.out.println(mensagem);
		System.out.println("Programa encerrado!");
		
		scan.close();
		
	}
	
}
