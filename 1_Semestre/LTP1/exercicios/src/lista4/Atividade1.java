package lista4;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		double valorMetros, valorTransformado;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita entrada de dados pelo usu�rio
		System.out.print("Digite o valor em metros: ");
		valorMetros = scan.nextDouble();  // L� e atribui o valor digitado na vari�vel valorMetros
		
//		Transforma o valor de metros em decimetros
		valorTransformado = valorMetros * 10;
		
//		Imprime o valor em decimetros
		System.out.printf("O valor de %.2f m para decimetro �: %.2f dm", valorMetros, valorTransformado);
		
//		Transforma o valor de metros em centrimetros
		valorTransformado = valorMetros * 100;
		
//		Imprime o valor em centrimetros
		System.out.printf("\nO valor de %.2f m para centimetro �: %.2f cm", valorMetros, valorTransformado);
		
//		Transforma o valor de metros em milimetros
		valorTransformado = valorMetros * 1000;
		
//		Imprime o valor em milimetros
		System.out.printf("\nO valor de %.2f m para decimetro �: %.2f mm", valorMetros, valorTransformado);
		
		scan.close();
		
	}
	
}