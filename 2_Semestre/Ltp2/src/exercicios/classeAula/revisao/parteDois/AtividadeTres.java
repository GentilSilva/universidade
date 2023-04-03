package exercicios.classeAula.revisao.parteDois;

import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        char classeOperario;
        int codigoOperario;
        int numeroPecasFabricadas;
        float salarioFuncionario = 0;
        float somaSalario = 0;
        int totalPecasFabricadas = 0;
        int operarioFabricouMenorNumeroPeca = 0;
        float mediaPecasFabricadas = 0;
        int funcionarioClasseB = 0;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.print("Digite o código do operário: ");
            codigoOperario = scan.nextInt();
            if(codigoOperario == 0) {
                break;
            }

            do {
                System.out.print("Digite a classe do funcionário: ");
                classeOperario = scan.next().charAt(0);
            } while(classeOperario != 'A' && classeOperario != 'B' && classeOperario != 'C');

            do {
                System.out.print("Digite a quantidade de peças fabricadas: ");
                numeroPecasFabricadas = scan.nextInt();
            } while(numeroPecasFabricadas <= 0);

            if(classeOperario == 'A') {
                salarioFuncionario = 500;
                if(numeroPecasFabricadas <= 30) {
                    salarioFuncionario += 2 * numeroPecasFabricadas;
                } else if(numeroPecasFabricadas <= 40) {
                    salarioFuncionario += 2.3f * numeroPecasFabricadas;
                } else {
                    salarioFuncionario += 2.8f * numeroPecasFabricadas;
                }
            } else if(classeOperario == 'B') {
                salarioFuncionario = 1200;
                mediaPecasFabricadas += numeroPecasFabricadas;
                funcionarioClasseB += 1;
            } else {
                salarioFuncionario = 0;
                if(numeroPecasFabricadas <= 50) {
                    salarioFuncionario += 40 * numeroPecasFabricadas;
                } else {
                    salarioFuncionario += 45 * numeroPecasFabricadas;
                }
            }

            if(totalPecasFabricadas == 0) {
                operarioFabricouMenorNumeroPeca = codigoOperario;
            } else if(operarioFabricouMenorNumeroPeca < numeroPecasFabricadas) {
                operarioFabricouMenorNumeroPeca = codigoOperario;
            }

            somaSalario += salarioFuncionario;
            totalPecasFabricadas += numeroPecasFabricadas;

            System.out.println(String.format("O salario final do funcionário é: %.2f", salarioFuncionario));

        } while(codigoOperario != 0);

        if(funcionarioClasseB != 0) {
            mediaPecasFabricadas = mediaPecasFabricadas / funcionarioClasseB;
        }

        System.out.println(String.format("""
				O total gasto pela empresa é: %.2f
				O número total de peças fabricadas é: %d
				O código do operário que fabricou o menor número de peças é: %d
				A média de peças fabricadas pelos funcionários da classe B é: %.2f
				""", somaSalario, totalPecasFabricadas, operarioFabricouMenorNumeroPeca, mediaPecasFabricadas));

        scan.close();
    }

}
