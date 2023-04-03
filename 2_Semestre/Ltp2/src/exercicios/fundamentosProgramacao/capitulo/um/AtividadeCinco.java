package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeCinco {

    public static void main(String[] args) {

        float precoProduto;
        float novoPreco;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        precoProduto = leia.nextFloat();

        novoPreco =  (float) (precoProduto * 0.9);

        System.out.println("O valor do produto com desconto e: R$" + novoPreco);

        leia.close();

    }

}
