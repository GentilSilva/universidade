package lista10;

public class Atividade3 {

	public static void main(String[] args) {
		
		int[][] arrProduto = new int[4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arrProduto[i][j] = i * j;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			String mensagem = "| ";
			for(int j = 0; j < 4; j++) {
				mensagem += arrProduto[i][j] + " ";
			}
			System.out.println(mensagem + "|");
		}
		
	}
	
}
