package exercicios.classeAula.revisao.parteUm;

import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        String mensagem;
        byte tempoCasa;
        float salarioEmpregado;
        float bonusSalarial;
        float descontoTransporte;


        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tempo de casa do empregado: ");
        tempoCasa = scan.nextByte();
        System.out.print("Digite o valor do salario do empregado: ");
        salarioEmpregado = scan.nextFloat();

        if(tempoCasa <= 5) {
            if(salarioEmpregado <= 300) {
                bonusSalarial = 50.0f;
                descontoTransporte = salarioEmpregado * 0.05f;
            } else {
                bonusSalarial = 80.0f;
                descontoTransporte = salarioEmpregado * 0.06f;
            }
        } else if(tempoCasa <= 10) {
            if(salarioEmpregado <= 500) {
                bonusSalarial = salarioEmpregado * 0.15f;
                descontoTransporte = 70.0f;
            } else if(salarioEmpregado <= 2000) {
                bonusSalarial = salarioEmpregado * 0.13f;
                descontoTransporte = 90.0f;
            } else {
                bonusSalarial = salarioEmpregado * 0.12f;
                descontoTransporte = salarioEmpregado * 0.08f;
            }
        } else {
            bonusSalarial = 300.0f;
            descontoTransporte = salarioEmpregado * 0.04f;
        }

        mensagem = String.format("O funcionário de salário: R$%.2f e tempo de casa %d anos, tem como bonus salarial: R$%.2f "
                + "e desconto de vale transporte de: R$%.2f", salarioEmpregado, tempoCasa, bonusSalarial, descontoTransporte);

        System.out.println(mensagem);

        scan.close();

    }

}
