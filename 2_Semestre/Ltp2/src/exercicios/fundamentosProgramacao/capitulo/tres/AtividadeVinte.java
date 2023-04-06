package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeVinte {

    public static void main(String[] args) {

        float medidaAngulo;
        float distanciaParede;
        float medidaEscada;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do angulo que a esca faz com o chão: ");
        medidaAngulo = leia.nextFloat();
        System.out.print("Digite a distancia que a escada esta da parede: ");
        distanciaParede = leia.nextFloat();

        medidaEscada = (float) (distanciaParede / Math.cos(medidaAngulo));

        System.out.println("O tamanho da escada e de: " + medidaEscada);

    }

}
