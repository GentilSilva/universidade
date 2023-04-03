package listaRevisao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int[] vetNumeros = new int[10];
		int maiorValor = vetNumeros[0];
		int posicaoMaiorValor = 0;
		Scanner scan = new Scanner(System.in);
		
//		Preenche vetor
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			vetNumeros[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			if(maiorValor< vetNumeros[i]) {
				maiorValor = vetNumeros[i];
				posicaoMaiorValor = i;
			}
		}
		
//		Imprime vetor
		System.out.println();
		String mensagem = "| ";
		for(int i = 0; i < 10; i++) {
			mensagem += vetNumeros[i] + " ";
		}
		System.out.println(mensagem + "|");
		
		System.out.println();
		System.out.printf("O maior número é: %d. \n"
				+ "E ele se encontra na posicao %d.", maiorValor, posicaoMaiorValor);
		
		scan.close();
		
	}
	
}
