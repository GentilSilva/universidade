package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeOito {

    public static void main(String[] args) {

        float salarioFuncionario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o salario do funcionario: ");
        salarioFuncionario = leia.nextFloat();

        if(salarioFuncionario <=  300) {
            System.out.println("O novo salario do funcionario e: " + (salarioFuncionario * 1.35));
        } else {
            System.out.print("O novo salario do funcionario e: " + (salarioFuncionario * 1.15));
        }

    }

}
