package lista1;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		double custoDeFabrica;
		double custoDoDistribuidor;
		double custoDeImpostos;
		double custoParaConsumidor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o custo de fabricacao do carro: ");
		custoDeFabrica = scan.nextDouble();
		
		custoDoDistribuidor = custoDeFabrica * 28 / 100;
		custoDeImpostos = custoDeFabrica * 45 / 100;
		
		custoParaConsumidor = custoDeFabrica + custoDoDistribuidor + custoDeImpostos;
		
		System.out.println("O valor para o consumidor deste determinado carro e: " + custoParaConsumidor);
		
		scan.close();
		
	}
	
}