package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        float numUm;
        float numDois;
        float numTres;
        float multiplicacao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro numero: ");
        numUm = leia.nextFloat();
        System.out.print("Digite o valor do segundo numero: ");
        numDois = leia.nextFloat();
        System.out.print("Digite o valor do terceiro numero: ");
        numTres = leia.nextFloat();

        multiplicacao = numUm * numDois * numTres;

        System.out.println("A mutiplicacao entre os tres valores e: " + multiplicacao);

        leia.close();

    }

}
