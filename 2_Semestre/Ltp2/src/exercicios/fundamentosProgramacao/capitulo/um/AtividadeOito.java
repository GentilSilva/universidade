package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeOito {

    public static void main(String[] args) {

        float pesoQuilo;
        float pesoGrama;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do peso em quilos: ");
        pesoQuilo = leia.nextFloat();

        pesoGrama = pesoQuilo * 1000;

        System.out.println("O seu peso em gramas e: " + pesoGrama);

        leia.close();

    }

}
