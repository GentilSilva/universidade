package lista5;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		double salario, prestacao, porcentagemSalario;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario: ");
		salario = scan.nextDouble();
		System.out.print("Digite o valor da prestacao: ");
		prestacao = scan.nextDouble();
		
		porcentagemSalario = salario * 30 / 100;
		
		if(porcentagemSalario >= prestacao) {
			System.out.println("Emprestimo pode ser concedido");
		} else {
			System.out.println("Emprestimo nao pode ser concedido");
		}
		
		scan.close();
		
	}
}