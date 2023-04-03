package lista8;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		int razao, termoDesejado;
		int termo = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro termo: ");
		termo = scan.nextInt();
		System.out.print("Digite o valor da razao: ");
		razao = scan.nextInt();
		System.out.print("Digite o indice do ultimo termo: ");
		termoDesejado = scan.nextInt();
		
		if(razao < 0) {
			for(int i = 0; i < termoDesejado; i++) {
				System.out.print(termo + " ");
				termo += razao;
			}
		} else {
			for(int i = 0; i < termoDesejado; i++) {
				System.out.print(termo + " ");
				termo += razao;
			}
		}
		
		scan.close();
		
	}
	
}
