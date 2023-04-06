package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float notaTres;
        float notaQuatro;
        float mediaAritmetica;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        notaUm = leia.nextFloat();
        System.out.print("Digite a segunda nota: ");
        notaDois = leia.nextFloat();
        System.out.print("Digite a terceira nota: ");
        notaTres = leia.nextFloat();
        System.out.print("Digite a quarta nota: ");
        notaQuatro = leia.nextFloat();

        mediaAritmetica = (notaUm + notaDois + notaTres + notaQuatro) / 4;

        if(mediaAritmetica >= 7) {
            System.out.println("Aluno aprovado com nota: " + mediaAritmetica);
        } else {
            System.out.println("Aluno reprovado com nota: " + mediaAritmetica);
        }

    }

}
