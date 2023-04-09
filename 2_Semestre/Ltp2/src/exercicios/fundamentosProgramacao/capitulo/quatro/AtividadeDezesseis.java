package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDezesseis {

    public static void main(String[] args) {

        float precoAtual;
        int codigoProduto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o preco do produto: ");
        precoAtual = leia.nextFloat();
        System.out.print("Informe o codigo do produto: ");
        codigoProduto = leia.nextInt();

        if(precoAtual <= 30) {
            System.out.println("Para esse valor nao possuimos desconto. O valor total e: " + precoAtual);
        } else if(precoAtual <= 100) {
            System.out.println("Para esse valor existe um desconto de 10%. O valor total e: " + (precoAtual * 0.9));
        } else {
            System.out.println("Para esse valor existe um desconto de 15%. O valor total e: " + (precoAtual * 0.85));
        }

    }

}
