package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeDezesseis {

    public static void main(String[] args) {

        float catetoAdjacente;
        float catetoOposto;
        float hipotenusa;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do catego adjacente: ");
        catetoAdjacente = leia.nextFloat();
        System.out.print("Digite o valor do catego oposto: ");
        catetoOposto = leia.nextFloat();

        hipotenusa = (float) (Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2)));

        System.out.println("O valor da hipotenusa e: " + hipotenusa);

    }

}
