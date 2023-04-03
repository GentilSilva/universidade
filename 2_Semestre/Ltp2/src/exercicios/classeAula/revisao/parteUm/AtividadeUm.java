package exercicios.classeAula.revisao.parteUm;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        String nomeAluno;
        String mensagem;
        float nota1;
        float nota2;
        float nota3;
        float media;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = scan.next();
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.print("Digite o valor da terceira nota: ");
        nota3 = scan.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if(media <= 4) {
            mensagem = String.format("A média do aluno %s é: %.2f. Aluno reprovado.", nomeAluno, media);
        } else if(media < 7) {
            mensagem = String.format("A média do aluno %s é: %.2f. Aluno de recuperação.", nomeAluno, media);
        } else {
            mensagem = String.format("A média do aluno %s é: %.2f. Aluno aprovado.", nomeAluno, media);
        }

        System.out.println(mensagem);

        scan.close();

    }

}
