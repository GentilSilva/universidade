package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        float numUm;
        float numDois;
        float divisao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro numero: ");
        numUm = leia.nextFloat();
        System.out.print("Digite o valor do segundo numero. Obs: Esse numero tem que ser diferente de zero: ");
        numDois = leia.nextFloat();

        divisao = numUm / numDois;

        System.out.println("A divisao do primerio pelo segundo numero e: " + divisao);

        leia.close();

    }

}
