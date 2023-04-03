package lista1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		int idadeEmAnos;
		int idadeEmMeses;
		int idadeEmDias;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua quantos anos de vida, meses e dias: ");
		System.out.print("Anos: ");
		idadeEmAnos = scan.nextInt();
		System.out.print("Meses: ");
		idadeEmMeses = scan.nextInt();
		System.out.print("Dias: ");
		idadeEmDias = scan.nextInt();
				
		idadeEmAnos = (idadeEmAnos * 365);
		idadeEmMeses = (idadeEmMeses * 30);
		idadeEmDias = idadeEmDias + idadeEmAnos + idadeEmMeses;
		
		System.out.println("A sua idade em dias e equivalente a: " + idadeEmDias + " dias.");
	
		scan.close();
		
	}
	
	
}