package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeQuinze {

    public static void main(String[] args) {

        int tipoInvestimento;
        float valorInvestimento;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o tipo de investimento: ");
        tipoInvestimento = leia.nextInt();
        System.out.print("Informe o valor do investimento: ");
        valorInvestimento = leia.nextFloat();

        if(tipoInvestimento == 1) {
            System.out.println("O tipo de investimento e poupanca, o rendimento mensal e de 3%. O retorno esse mes e: " + (valorInvestimento * 1.03));
        } else if(tipoInvestimento == 2) {
            System.out.println("O tipo de investimento e fundos de renda fixa, o rendimento mensal e de 3%. O retorno esse mes e: " + (valorInvestimento * 1.04));
        }

    }

}
