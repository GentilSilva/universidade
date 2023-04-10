package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeVinteCinco {

    public static void main(String[] args) {

        int horasExtras;
        int faltasHoras;
        int gratificacao;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a quantidade de horas extras do funcionario: ");
        horasExtras = leia.nextInt();
        System.out.print("Informe quantas horas o usuario faltou: ");
        faltasHoras = leia.nextInt();

        gratificacao = horasExtras - (2/3 * (faltasHoras));

        gratificacao = gratificacao * 60;

        if(gratificacao > 2400) {
            System.out.println("O premio e de 500 reais");
        } else if(gratificacao >= 1800) {
            System.out.println("O premio e de 400 reais");
        } else if(gratificacao >= 1200) {
            System.out.println("O premio e de 300 reais");
        } else if(gratificacao >= 600) {
            System.out.println("O premio e de 200 reais");
        } else {
            System.out.println("O premio e de 100 reais");
        }

    }

}
