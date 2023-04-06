package exercicios.fundamentosProgramacao.capitulo.tres;

import java.util.Scanner;

public class AtividadeDoze {

    public static void main(String[] args) {

        float salarioMinimo;
        float salarioFuncionario;
        float qtdSalarioMinimo;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo: ");
        salarioMinimo = leia.nextFloat();
        System.out.print("Digite o valor do salario do funcionario: ");
        salarioFuncionario = leia.nextFloat();

        qtdSalarioMinimo = salarioFuncionario / salarioMinimo;

        System.out.println(String.format("A quantidade de salarios minimos que esse funcionario recebe e: %.2f ", qtdSalarioMinimo));

        leia.close();

    }

}
