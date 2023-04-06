package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeDezenove {

    public static void main(String[] args) {

        float comprimentoQuarto;
        float larguraQuarto;
        float areaQuarto;
        int potenciaIluminacao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o comprimento do quarto: ");
        comprimentoQuarto = leia.nextFloat();
        System.out.print("Digite a largura do quarto: ");
        larguraQuarto = leia.nextFloat();

        areaQuarto = comprimentoQuarto * larguraQuarto;
        potenciaIluminacao = (int) areaQuarto * 18;

        System.out.println("Para o quarto de area: " + areaQuarto + "m² a potencia necessaria para iluminr e: " + potenciaIluminacao + "W");

    }

}
