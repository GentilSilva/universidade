package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeSeis {

    public static void main(String[] args) {

        float salario;
        float valorVendas;
        float comissao;
        float salarioFinal;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salario do funcionario: ");
        salario = leia.nextFloat();
        System.out.print("Digite o valor total de vendas do funcionario: ");
        valorVendas = leia.nextFloat();

        comissao = (float) (valorVendas * 0.04);
        salarioFinal = salario + comissao;

        System.out.println("O salario final do funcionario e: R$" + salarioFinal);

        leia.close();

    }

}
