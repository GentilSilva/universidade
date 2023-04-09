package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeQuatorze {

    public static void main(String[] args) {

        float salarioFuncionario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o salario do funcionario: ");
        salarioFuncionario = leia.nextFloat();

        if(salarioFuncionario <= 300) {
            System.out.println("O novo salario do funcionario e: " + (salarioFuncionario * 1.5));
        } else if(salarioFuncionario <= 500) {
            System.out.println("O novo salario do funcioanrio e: " + (salarioFuncionario * 1.4));
        } else if(salarioFuncionario <= 700) {
            System.out.println("O novo salario do funcioanrio e: " + (salarioFuncionario * 1.3));
        } else if(salarioFuncionario <= 800) {
            System.out.println("O novo salario do funcioanrio e: " + (salarioFuncionario * 1.2));
        } else if(salarioFuncionario <= 1000) {
            System.out.println("O novo salario do funcioanrio e: " + (salarioFuncionario * 1.1));
        } else {
            System.out.println("O novo salario do funcioanrio e: " + (salarioFuncionario * 1.05));
        }

    }

}
