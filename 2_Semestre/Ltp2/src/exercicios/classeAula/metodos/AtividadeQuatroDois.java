package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeQuatroDois {

    public static void main(String[] args) {

        String[] nomeEmpregado = new String[100];
        int codigoEmpregado;
        int pecasFabricadasMes;
        Scanner leia = new Scanner(System.in);
        int contador;
        int totalFuncionarios = 0;
        float[] salario = new float[100];
        float totalSalarios = 0;
        float mediaSalarial = 0;

        for(contador = 0; contador < 100; contador++) {
            System.out.print("Digite o nome do empregado: ");
            nomeEmpregado[contador] = leia.nextLine();

            if(nomeEmpregado[contador].equalsIgnoreCase("Fim")) {
                break;
            }

            do {
                System.out.print("Digite o codigo do empregado: ");
                codigoEmpregado = Integer.parseInt(leia.nextLine());
                if(codigoEmpregado < 1 || codigoEmpregado > 999) {
                    System.out.print("Codigo digitado e invalido, digite um valor entre 1 e 999. ");
                }
            } while(codigoEmpregado < 1 || codigoEmpregado > 999);

            do {
                System.out.print("Digite o numero de pecas fabricadas no mes: ");
                pecasFabricadasMes = Integer.parseInt(leia.nextLine());
                if(pecasFabricadasMes < 1) {
                    System.out.print("Quantidade de pecas invalidas, deve ser maior do que zero. ");
                }
            } while(pecasFabricadasMes < 1);

            totalFuncionarios++;
            salario[contador] = calcularSalarioFuncionario(pecasFabricadasMes);
            totalSalarios += salario[contador];
        }

        System.out.println();
        for(int i = 0; i < contador; i++) {
            System.out.println(nomeEmpregado[i] + "  R$" + salario[i]);
        }

        if(totalFuncionarios != 0) {
            mediaSalarial = totalSalarios / totalFuncionarios;
        }

        System.out.println();
        System.out.println("Total pago com salarios: R$" + totalSalarios);
        System.out.println("Media dos salarios: R$" + mediaSalarial);
    }

    public static float calcularSalarioFuncionario(int pecasFabricadasFuncionario) {
        float salario;
        if(pecasFabricadasFuncionario <= 200) {
            salario = pecasFabricadasFuncionario * 2f;
        } else if(pecasFabricadasFuncionario <= 400) {
            salario = pecasFabricadasFuncionario * 2.3f;
        } else {
            salario = pecasFabricadasFuncionario * 2.5f;
        }
        return salario;
    }

}
