package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeVinteTres {

    public static void main(String[] args) {

        float primeiroAngulo;
        float segundoAngulo;
        float terceiroAngulo;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro angulo: ");
        primeiroAngulo = leia.nextFloat();
        System.out.print("Digite o valor do segundo angulo: ");
        segundoAngulo = leia.nextFloat();

        terceiroAngulo = 180 - (primeiroAngulo + segundoAngulo);

        System.out.println("O valor do terceiro angulo e: " + terceiroAngulo);

    }

}
