package lista9;

public class Atividade1 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int soma = 0;
		
//		A)
		arr[0] = 1;
		arr[1] = 0;
		arr[2] = 5;
		arr[3] = -2;
		arr[4] = -5;
		arr[5] = 7;
		
//		B)
		soma = arr[0] + arr[1] + arr[5];
		System.out.println(soma);
		
//		C)
		arr[4] = 100;
		
//		D)
		for (int i : arr) {
			System.out.println("[" + i + "]");
		}
		
		
	}
	
}