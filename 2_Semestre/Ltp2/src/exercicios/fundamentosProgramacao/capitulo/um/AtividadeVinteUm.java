package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeVinteUm {

    public static void main(String[] args) {

        int horasTrabalhadas;
        float salarioMinimo;
        int horasExtrasTrabalhadas;
        float valorHoratrabalhada;
        float valorHoraExtraTrabalhada;
        float salarioBruto;
        float quantiaHorasExtras;
        float salarioFinal;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = leia.nextInt();
        System.out.print("Digite o valor do salario minimo: ");
        salarioMinimo = leia.nextFloat();
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        horasExtrasTrabalhadas = leia.nextInt();

        valorHoratrabalhada = salarioMinimo / 8;
        valorHoraExtraTrabalhada = salarioMinimo / 4;
        salarioBruto = valorHoratrabalhada * horasTrabalhadas;
        quantiaHorasExtras = valorHoraExtraTrabalhada * horasExtrasTrabalhadas;
        salarioFinal = salarioBruto + quantiaHorasExtras;

        System.out.println("O salario a receber e: " + salarioFinal + "R$");

    }

}
