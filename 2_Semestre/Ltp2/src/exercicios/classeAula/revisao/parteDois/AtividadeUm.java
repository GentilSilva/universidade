package exercicios.classeAula.revisao.parteDois;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        String nome;
        float salario;
        int numeroDependentes;
        float somaSalarios = 0;
        float mediaSalarios;
        int salariosAcimaMilSetecentos = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            float aumento;
            float novoSalario;

            System.out.print("Digite o nome do funcionário: ");
            nome = scan.next();
            System.out.print("Digite o salário do funcionário: ");
            salario = scan.nextFloat();
            System.out.print("Digite a quantidade de dependentes do funcionário: ");
            numeroDependentes = scan.nextInt();

            if(salario < 1000) {
                aumento = salario * 0.3f;
            } else if(salario <= 2000) {
                aumento = salario * 0.2f;
            } else {
                aumento = salario * 0.1f;
            }

            novoSalario = salario + (aumento + (50 * numeroDependentes));
            somaSalarios += novoSalario;

            if(novoSalario > 1700) {
                salariosAcimaMilSetecentos += 1;
            }



            System.out.println(String.format("O novo salário do funcionário %s é: R$%.2f.", nome, novoSalario));
        }

        mediaSalarios = somaSalarios / 10;

        System.out.println(String.format("""
				A soma dos novos salários é: R$%.2f
				A média dos novos salários é: R$%.2f
				O número de empregados que passou a receber mais de R$1700.00 é: %d
				""", somaSalarios, mediaSalarios,
                salariosAcimaMilSetecentos));

        scan.close();
    }

}
