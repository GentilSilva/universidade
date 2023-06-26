package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeDezoito {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade = 1;
        char sexo;
        double salario;
        double mediaSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int mulheresSalario200 = 0;
        double menorSalario = 0;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = 0;
        int contador = 0;

        while(true) {
            System.out.print("Informe a idade (OU -1 PARA ENCERRAR): ");
            idade = leia.nextInt();

            if(idade < 0) {
                break;
            }

            System.out.print("Informe o sexo (F ou M): ");
            sexo = leia.next().charAt(0);
            System.out.print("Informe o salário: ");
            salario = leia.nextDouble();

            mediaSalarios += salario;


            if(menorIdade == 0) {
                menorIdade = idade;
                maiorIdade = idade;
            } if(idade > maiorIdade) {
                maiorIdade = idade;
            } else {
                menorIdade = idade;
            }

            if(sexo == 'F' && salario <= 200) {
                mulheresSalario200++;
            }

            if(menorSalario == 0) {
                menorSalario = salario;
            } else if(salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
            contador++;
        }

        mediaSalarios /= contador;

        System.out.printf("""
                A média dos salários do grupo é: %.2f
                A maior idade do grupo é: %d
                A menor idade do grupo é: %d
                A quantidade de mulheres com salário até 200 reais é: %d
                A idade da pessoa que possui o menor salário é: %d
                O sexo da pessoa que possui o menor salário é: %s
                """, mediaSalarios, maiorIdade, menorIdade, mulheresSalario200, idadeMenorSalario, sexoMenorSalario);
    }
}
