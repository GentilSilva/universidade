package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float mediaPonderada;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor da primeira nota: ");
        notaUm = leia.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        notaDois = leia.nextFloat();

        mediaPonderada = ((notaUm * 2) + (notaDois * 3)) / 5;

        System.out.println("A media ponderada das notas e: " + mediaPonderada);

        leia.close();

    }

}
