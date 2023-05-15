package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeNove {

    public static void main(String[] args) {

        int idade;
        float peso;
        float altura;
        float mediaIdades = 0;
        int qtdPessoasPesoAltura = 0;
        float porcentagemIdadeAltura = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Informe a idade: ");
            idade = leia.nextInt();
            System.out.print("Informe o peso: ");
            peso = leia.nextFloat();
            System.out.print("Informe a altura: ");
            altura = leia.nextFloat();

            mediaIdades += idade;
            if(peso > 90 && altura < 1.5) {
                qtdPessoasPesoAltura += 1;
            }
            if((idade > 10 && idade < 30) && altura > 1.9) {
                porcentagemIdadeAltura += 1;
            }
        }

        System.out.println("A media de idades e: " + (mediaIdades / 10));
        System.out.println("A quantidade de pessoas com peso superior a 90Kg e altura inferior a 1.5m e: " + qtdPessoasPesoAltura);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos e altura superior a 1.9m e: " + (porcentagemIdadeAltura * 100) /  10);
    }

}
