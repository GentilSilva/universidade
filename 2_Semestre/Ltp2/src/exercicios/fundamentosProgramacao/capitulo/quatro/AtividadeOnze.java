package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeOnze {

    public static void main(String[] args) {

        float salarioAtual;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o salario atual: ");
        salarioAtual = leia.nextFloat();

        if(salarioAtual <= 300) {
            System.out.println("O valor do aumento e: " + (salarioAtual * 0.15) + " o novo salario e: " + (salarioAtual * 1.15));
        } else if(salarioAtual <= 600) {
            System.out.println("O valor do aumento e: " + (salarioAtual * 0.1) + " o novo salario e: " + (salarioAtual * 1.1));
        } else if(salarioAtual <= 900) {
            System.out.println("O valor do aumento e: " + (salarioAtual * 0.05) + " o novo salario e: " + (salarioAtual * 1.05));
        } else {
            System.out.println("Não existe aumento para sua faixa salarial, o seu salario e: " + salarioAtual);
        }

    }

}
