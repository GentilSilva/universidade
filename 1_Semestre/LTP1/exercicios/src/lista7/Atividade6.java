package lista7;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		char sexo;
		int masculino = 0;
		int feminino = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 30; i++) {
			System.out.print("Digite o sexo em letra maiuscula: ");
			sexo = scan.next().charAt(0);
			if(sexo == 'M') {
				masculino += 1;
			} else if(sexo == 'F') {
				feminino += 1;
			}
		}
		System.out.println("A quantidade de pessoas do sexo masculino e: " + masculino);
		System.out.println("A quantidade de pessoas do sexo feminino e: " + feminino);
		
		scan.close();
		
	}
	
}

