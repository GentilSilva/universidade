package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeDezoito {

    public static void main(String[] args) {

        float temperaturaCelsius;
        float temperaturaFahreinheit;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        temperaturaCelsius = leia.nextFloat();

        temperaturaFahreinheit = (float) (temperaturaCelsius + 32 * 180 / 100);

        System.out.println("A temperatura em Fahreinheit e: " + temperaturaFahreinheit);

    }

}
