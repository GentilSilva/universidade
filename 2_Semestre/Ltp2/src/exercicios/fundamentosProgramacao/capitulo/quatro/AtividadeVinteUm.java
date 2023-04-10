package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeVinteUm {

    public static void main(String[] args) {

        float precoProduto;
        int codigoOrigem;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o preco do produto: ");
        precoProduto = leia.nextFloat();
        System.out.print("Informe o codigo de origem: ");
        codigoOrigem = leia.nextInt();

        if(codigoOrigem == 1) {
            System.out.println("Produto de origem Sul");
        } else if(codigoOrigem == 2) {
            System.out.println("Produto de origem Norte");
        } else if(codigoOrigem == 3) {
            System.out.println("Produto de origem Leste");
        } else if(codigoOrigem == 4) {
            System.out.println("Produto de origem Oeste");
        } else if(codigoOrigem == 5 || codigoOrigem == 6) {
            System.out.println("Produto de origem Nordeste");
        } else if(codigoOrigem == 7 || codigoOrigem == 8 || codigoOrigem == 9) {
            System.out.println("Produto de origem Sudeste");
        } else if(codigoOrigem >= 10 && codigoOrigem <= 20) {
            System.out.println("Produto de origem Centro-Oeste");
        } else {
            System.out.println("Produto de origem Nordeste");
        }
    }

}
