package lista1;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		double salarioFixo;
		int carrosVendidos;
		double valorTotalDeVendas;
		double comissaoFixa;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de carros vendidos: ");
		carrosVendidos = scan.nextInt();
		System.out.print("Digite o valor total de suas vendas: ");
		valorTotalDeVendas = scan.nextDouble();
		System.out.print("Digite o valor do salario fixo do vendedor: ");
		salarioFixo = scan.nextDouble();
		System.out.print("Digite o valor recebido como comissao fixa por carro vendido do vendedor: ");
		comissaoFixa = scan.nextDouble();
		
		double valorDeCadaCarro = valorTotalDeVendas / carrosVendidos;
		double comissaoPorVenda = valorDeCadaCarro * 5 / 100;
		double comissaoFinal = comissaoFixa + comissaoPorVenda;
		
		double salarioFinal = salarioFixo + comissaoFinal * carrosVendidos;
		
		System.out.println("O salario final do vendedor e: " + salarioFinal);
		
		scan.close();
		
	}
	
}