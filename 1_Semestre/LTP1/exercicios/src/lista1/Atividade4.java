package lista1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		double salarioAtual;
		double reajuste;
		double salarioReajustado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario atual: ");
		salarioAtual = scan.nextDouble();
		System.out.print("Digite o valor do reajuste em porcentagem: ");
		reajuste = scan.nextDouble();
		
		salarioReajustado = salarioAtual + (salarioAtual * (reajuste / 100));
		
		System.out.println("O seu novo salario e de: " + salarioReajustado);
		
		scan.close();
		
	}
	
}