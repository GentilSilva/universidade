package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeVinteTres {

    public static void main(String[] args) {

        int codigoProduto;
        int quantidadeComprada;
        float precoTotal;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o codigo do produto: ");
        codigoProduto = leia.nextInt();
        System.out.print("Informe a quantidade comprada: ");
        quantidadeComprada = leia.nextInt();

        if(codigoProduto >= 1 && codigoProduto <= 10) {
            precoTotal = quantidadeComprada * 10;
            System.out.println("O preco do produto comprado e: R$ 10,00. O preco total da nota e: " + precoTotal);
        } else if(codigoProduto <= 20) {
            precoTotal = quantidadeComprada * 15;
            System.out.println("O preco do produto comprado e: R$ 15,00. O preco total da nota e: " + precoTotal);
        } else if(codigoProduto <= 30) {
            precoTotal = quantidadeComprada * 20;
            System.out.println("O preco do produto comprado e: R$ 20,00. O preco total da nota e: " + precoTotal);
        } else {
            precoTotal = quantidadeComprada * 30;
            System.out.println("O preco do produto comprado e: R$ 30,00. O preco total da nota e: " + precoTotal);
        }

        if(precoTotal <= 250) {
            System.out.println("O desconto para o preco total da nota e de 5%, o valor a pagar e: " + (precoTotal * 0.95));
        } else if(precoTotal <= 500) {
            System.out.println("O desconto para o preco total da nota e de 10%, o valor a pagar e: " + (precoTotal * 0.9));
        } else {
            System.out.println("O desconto para o preco total da nota e de 15%, o valor a pagar e: " + (precoTotal * 0.85));
        }

    }

}
