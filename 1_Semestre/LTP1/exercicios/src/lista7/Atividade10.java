package lista7;

public class Atividade10 {

	public static void main(String[] args) {
		
		double chico = 1.50;
		double juca = 1.10;
		int anos = 0;
		
		while(juca < chico) {
			chico += 0.01;
			juca += 0.04;
			
			System.out.printf("A altura de chico �: %.2f m \n", chico);
			System.out.printf("A altura de juca �: %.2f m \n", juca);
			anos += 1;
		}
		
		System.out.println("Foi necess�rio " + anos + " anos para que juca fique maior que chico.");
		
	}
	
}

