package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeVinteQuatro {

    public static void main(String[] args) {

        float quantidadeReais;
        float dolares;
        float marcoAlemao;
        float libraEsterlina;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de reais que possui: ");
        quantidadeReais = leia.nextFloat();

        dolares = quantidadeReais / 1.80f;
        marcoAlemao = quantidadeReais / 2f;
        libraEsterlina = quantidadeReais / 1.57f;

        System.out.println("A quantidade de dolares em maos e: " + dolares);
        System.out.println("A quantidade de marco alemao em maos e: " + marcoAlemao);
        System.out.println("A quantidade de libra esterlina em maos e: " + libraEsterlina);

    }

}
