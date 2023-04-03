package lista5;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		String letra;
		boolean verifica;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a letra: ");
		letra = scan.nextLine();

		verifica = letra.matches("[aeiou]");
		
		if(verifica) {
			System.out.println("A letra digitada e vogal");
		} else {
			System.out.println("A letra digitada e consoante");
		}
		
		scan.close();
		
	}
}
