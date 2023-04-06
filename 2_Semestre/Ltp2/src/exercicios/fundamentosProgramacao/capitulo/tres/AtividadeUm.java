package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        float numUm;
        float numDois;
        float subtracao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro numero: ");
        numUm = leia.nextFloat();
        System.out.print("Digite o valor do segundo numero: ");
        numDois = leia.nextFloat();

        subtracao = numUm - numDois;

        System.out.print("A subtracao do primeiro numero pelo segundo e: " + subtracao);

        leia.close();

    }

}
