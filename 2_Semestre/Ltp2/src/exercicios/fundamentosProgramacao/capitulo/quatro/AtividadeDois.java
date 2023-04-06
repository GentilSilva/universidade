package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float mediaAritmetica;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        notaUm = leia.nextFloat();
        System.out.print("Informe a segunda nota: ");
        notaDois = leia.nextFloat();

        mediaAritmetica = (notaUm + notaDois) / 2;

        if(mediaAritmetica < 4) {
            System.out.println("Aluno reprovado com nota: " + mediaAritmetica);
        } else if(mediaAritmetica < 7) {
            System.out.println("Aluno para exame especial com nota: " + mediaAritmetica);
        } else {
            System.out.println("Aluno aprovado com nota: " + mediaAritmetica);
        }

    }

}
