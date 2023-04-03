package lista9;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		double[] arrNum = new double[8];
		int posicaoUm = 0;
		int posicaoDois = 0;
		double soma = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arrNum.length; i++) {
			System.out.print("Digite um valor: ");
			arrNum[i] = scan.nextDouble();
		}
		
		System.out.print("Digite a primeira posi  o: ");
		posicaoUm = scan.nextInt();
		System.out.print("Digite a segunda posi  o: ");
		posicaoDois = scan.nextInt();

		
		if(posicaoUm >= 0 && posicaoUm < 8) {
			soma += arrNum[posicaoUm];
		} else {
			System.out.println("Vetor n o possui tal  ndice");
		}
		
		if(posicaoDois >= 0 && posicaoDois < 8) {
			soma += arrNum[posicaoDois];
		} else {
			System.out.println("Vetor n o possui tal  ndice");
		}
		
		System.out.println("A soma  : " + soma);
		
		scan.close();
		
	}
	
}
