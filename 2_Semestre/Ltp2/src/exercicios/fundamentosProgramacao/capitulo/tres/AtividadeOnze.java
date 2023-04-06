package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeOnze {

    public static void main(String[] args) {

        float diagonalMaior;
        float diagonalMenor;
        float area;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal menor: ");
        diagonalMenor = leia.nextFloat();
        System.out.print("Digite o valor da diagonal maior: ");
        diagonalMaior = leia.nextFloat();

        area = (diagonalMaior * diagonalMenor) / 2;

        System.out.println("A area do losango e: " + area + "m²");

        leia.close();

    }

}
