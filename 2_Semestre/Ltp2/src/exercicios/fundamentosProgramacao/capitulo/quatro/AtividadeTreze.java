package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeTreze {

    public static void main(String[] args) {

        float precoProduto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o preco do produto: ");
        precoProduto = leia.nextFloat();

        if(precoProduto <= 50) {
            precoProduto = precoProduto * 1.05f;
        } else if(precoProduto <= 100) {
            precoProduto = precoProduto * 1.1f;
        } else {
            precoProduto = precoProduto * 1.15f;
        }

        if(precoProduto <= 80) {
            System.out.println("O novo valor do produto e: " + precoProduto + " e sua classificacao e BARATO.");
        } else if(precoProduto <= 120) {
            System.out.println("O novo valor do produto e: " + precoProduto + " e sua classificacao e NORMAL.");
        } else if(precoProduto <= 200) {
            System.out.println("O novo valor do produto e: " + precoProduto + " e sua classificacao e CARO.");
        } else {
            System.out.println("O novo valor do produto e: " + precoProduto + " e sua classificacao e MUITO CARO.");
        }

    }

}
