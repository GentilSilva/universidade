package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeSete {

    public static void main(String[] args) {

        float peso;
        float novoPesoEngordando;
        float novoPesoEmagrecendo;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        peso = leia.nextFloat();

        novoPesoEngordando = (float) (peso * 1.15);
        novoPesoEmagrecendo = (float) (peso * 0.8);

        System.out.println("O peso com aumento de 15% e: " + novoPesoEngordando);
        System.out.println("O peso com diminuicao de 20% e: " + novoPesoEmagrecendo);

        leia.close();

    }

}
