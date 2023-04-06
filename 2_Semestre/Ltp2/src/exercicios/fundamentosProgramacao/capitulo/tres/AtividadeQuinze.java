package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeQuinze {

    public static void main(String[] args) {

        float salario;
        float restoSalario;
        float contaUm;
        float contaDois;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salario de Joao: ");
        salario = leia.nextFloat();
        System.out.print("Digite o valor da prieira conta: ");
        contaUm = leia.nextFloat();
        System.out.print("Digite o valor da segunda conta: ");
        contaDois = leia.nextFloat();

        contaUm = (float) (contaUm * 1.02);
        contaDois = (float) (contaDois * 1.02);
        restoSalario = salario - (contaUm + contaDois);

        System.out.println("O salario restante de Joao e: R$" + restoSalario);

        leia.close();

    }

}
