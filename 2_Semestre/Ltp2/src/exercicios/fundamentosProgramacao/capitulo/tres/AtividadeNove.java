package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeNove {

    public static void main(String[] args) {

        float baseMenor;
        float baseMaior;
        float altura;
        float area;
        Scanner leia = new Scanner(System.in);


        System.out.print("Digite o valor da base menor: ");
        baseMenor = leia.nextFloat();
        System.out.print("Digite o valor da base maior: ");
        baseMaior = leia.nextFloat();
        System.out.print("Digite o valor da altura: ");
        altura = leia.nextFloat();

        area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.print("O valor da area do trapezio e: " + area + "m²");

        leia.close();

    }

}
