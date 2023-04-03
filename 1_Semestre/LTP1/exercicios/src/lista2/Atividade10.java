package lista2;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		double raio;
		
		Scanner scan = new Scanner(System.in);
		
//		Solicita a entrada de dados pelo usuário
		System.out.print("Digite o valor do raio: ");
		raio = scan.nextDouble();  // Lê e atribui o valor digitado na variável raio
		
//		Calcula a area e depois o perimetro
		double area = Math.PI + Math.pow(raio, 2);
		double perimetro = 2 + Math.PI * raio;
		
//		Formata a mensagem para imprimir os números com 2 casas decimais
		String mensagem = String.format("A area do circulo de raio %.2f e: %.2f e o perimetro e: %.2f", raio, area, perimetro);
		
//		Imprime o resultado
		System.out.println(mensagem);
		
		scan.close();
		
	}
	
}