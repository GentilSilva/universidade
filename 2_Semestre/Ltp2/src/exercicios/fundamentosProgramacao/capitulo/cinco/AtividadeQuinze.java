package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeQuinze {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char sexo;
        char resposta;
        int respostaSim = 0;
        int respostaNao = 0;
        int mulheresSim = 0;
        double porcentagemHomensNao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o sexo (F ou M): ");
            sexo = leia.next().charAt(0);
            System.out.print("Informe a resposta (S ou N): ");
            resposta = leia.next().charAt(0);

            if(resposta == 'S') {
                respostaSim++;
            } else if(resposta == 'N') {
                respostaNao++;
            }

            if(resposta == 'S' && sexo == 'F') {
                mulheresSim++;
            }

            if(resposta == 'N' && sexo == 'M') {
                porcentagemHomensNao++;
            }
        }

        porcentagemHomensNao = (porcentagemHomensNao * 100) / 10;

        System.out.printf("""
                O número de pessoas que responderam sim é: %d
                O número de pessoas que responderam não é: %d
                O número de mulheres que responderam sim é: %d
                A porcentagem de homens que responderam não é: %.2f
                """, respostaSim, respostaNao, mulheresSim, porcentagemHomensNao);

    }
}
