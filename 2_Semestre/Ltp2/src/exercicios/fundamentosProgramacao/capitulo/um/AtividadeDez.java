package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeDez {

    public static void main(String[] args) {

        float lado;
        float area;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do lado: ");
        lado = leia.nextFloat();

        area = lado * lado;

        System.out.println("O valor da area do quadrado e: " + area + "m²");

        leia.close();

    }

}
