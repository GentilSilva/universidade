package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeQuatorze {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        int opniao;
        double mediaIdadesOtimo = 0;
        int contadorPessoas = 0;
        int quantidadeRegular = 0;
        double porcentagemBom = 0;

        for(int i = 0; i < 15; i++) {
            System.out.print("Informe sua idade: ");
            idade = leia.nextInt();
            System.out.print("Avalide o filme: 3 - Ótimo, 2 - Bom, 1 - Regular.");
            opniao = leia.nextInt();

            if(opniao == 3) {
                mediaIdadesOtimo += idade;
                contadorPessoas++;
            } else if(opniao == 2) {
                porcentagemBom++;
            } else {
                quantidadeRegular++;
            }
        }

        mediaIdadesOtimo /= contadorPessoas;
        porcentagemBom = (porcentagemBom * 100) / 15;

        System.out.printf("""
                A média das idades das pessoas que responderam ótimo é: %.2f
                A quantidade de pessoas que responderam regular é: %d
                A porcentagem de pessoas que responderam bom é: %.2f
                """, mediaIdadesOtimo, quantidadeRegular, porcentagemBom);
    }
}
