package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeVinteDois {

    public static void main(String[] args) {

        int numeroLados;
        int numeroDiagonais;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o numero de lados do poligono convexo: ");
        numeroLados = leia.nextInt();

        numeroDiagonais = numeroLados * (numeroLados - 3) / 2;

        System.out.println("O numero de diagonais que esse poligono possui e: " + numeroDiagonais);

    }

}
