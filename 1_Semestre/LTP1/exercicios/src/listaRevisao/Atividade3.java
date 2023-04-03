package listaRevisao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int[] vetNumeros = new int[6];
		int valorDigitado;
		Scanner scan = new Scanner(System.in);
		
//		Preenche vetor
		for(int i = 0; i < 6; i++) {
			System.out.print("Digite um valor par: ");
			valorDigitado = scan.nextInt();
			if(valorDigitado % 2 == 0) {
				vetNumeros[i] = valorDigitado;
			} else {
				System.out.println("Valor digitado não é par.");
				i--;
			}
		}
		
//		Imprime vetor
		System.out.println();
		String mensagem = "| ";
		for(int i = 5; i >= 0; i--) {
			mensagem += vetNumeros[i] + " ";
		}
		System.out.println(mensagem + "|");
		
		scan.close();
		
	}
	
}
