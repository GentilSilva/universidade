package lista1;

public class Atividade1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
			
		System.out.println("O valor a e: " + a + " e o valor b e: " + b);
		
//		b = b + a;
//		a = b - a;
//		b = b - a;
		
		c = a;
		a = b;
		b = c;
		
		
		System.out.println("Apos a inversao, o valor a e: " + a + " e o valor b e: " + b);
		
	}
	
}