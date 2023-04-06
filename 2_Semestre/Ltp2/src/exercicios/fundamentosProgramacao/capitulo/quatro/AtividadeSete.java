package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeSete {

    public static void main(String[] args) {

        float salarioFuncionario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o salario do funcionario: ");
        salarioFuncionario = leia.nextFloat();

        if(salarioFuncionario < 500) {
            System.out.println("O novo salario do funcionario e: " + (salarioFuncionario * 1.3f));
        } else {
            System.out.println("Funcionario não tem direito a aumento.");
        }

    }

}
