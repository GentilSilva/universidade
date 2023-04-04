package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeDezessete {

    public static void main(String[] args) {

        float raio;
        float comprimento;
        float areaEsfera;
        float volumeEsfera;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        raio = leia.nextFloat();

        comprimento = (float) (2 * Math.PI * raio);
        areaEsfera = (float) (Math.PI * Math.pow(raio, 2));
        volumeEsfera = (float) (4 * Math.PI * Math.pow(raio, 3) / 3);

        System.out.println("O comprimento de uma esfera de raio " + raio + " e: " + comprimento);
        System.out.println("A area da esfera de raio " + raio + " e: " + areaEsfera);
        System.out.println("O volume da esfera de raio " + raio + " e: " + volumeEsfera);

    }

}
