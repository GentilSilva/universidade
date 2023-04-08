package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDoze {

    public static void main(String[] args) {

        float salarioBruto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o salario bruto do funcionario: ");
        salarioBruto = leia.nextFloat();

        if(salarioBruto <= 350) {
            System.out.println("O salario do funcionario com desconto mais a gratificacao e: " + ((salarioBruto * 0.93) + 100));
        } else if(salarioBruto <= 600) {
            System.out.println("O salario do funcionario com desconto mais a gratificacao e: " + ((salarioBruto * 0.93) + 75));
        } else if(salarioBruto <= 900) {
            System.out.println("O salario do funcionario com desconto mais a gratificacao e: " + ((salarioBruto * 0.93) + 50));
        } else {
            System.out.println("O salario do funcionario com desconto mais a gratificacao e: " + ((salarioBruto * 0.93) + 35));
        }

    }

}
