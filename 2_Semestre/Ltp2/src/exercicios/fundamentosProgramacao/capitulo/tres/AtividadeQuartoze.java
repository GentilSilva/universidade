package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeQuartoze {

    public static void main(String[] args) {

        int dataNascimento;
        int dataAtual;
        int idadeAnos;
        int idadeMeses;
        int idadeSemanas;
        int idadeDias;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a data de nascimento: ");
        dataNascimento = leia.nextInt();
        System.out.print("Digite a data atual: ");
        dataAtual = leia.nextInt();

        idadeAnos = dataAtual - dataNascimento;
        idadeMeses = idadeAnos * 12;
        idadeSemanas = idadeAnos * 52;
        idadeDias = idadeMeses * 30;

        System.out.print("Voce tem " + idadeAnos + " anos, " + idadeMeses + " meses, " + idadeSemanas + " semanas e " + idadeDias + " dias.");

        leia.close();

    }

}
