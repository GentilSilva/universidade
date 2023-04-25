package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeSete {

    public static void main(String[] args) {

        int idade;
        float altura;
        float peso;
        int idadeSuperiorCinquenta = 0;
        int idadeEntreDezEVinte = 0;
        float alturaIdadeEntreDezEVinte = 0;
        int pesoInferiorAQuarenta = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Informe a idade: ");
            idade = leia.nextInt();
            System.out.print("Informe a altura: ");
            altura = leia.nextFloat();
            System.out.print("Informe o peso: ");
            peso = leia.nextFloat();

            if(idade > 50) {
                idadeSuperiorCinquenta += 1;
            } else if(idade >= 10 && idade <= 20) {
                alturaIdadeEntreDezEVinte += altura;
                idadeEntreDezEVinte += 1;
            }

            if(peso < 40) {
                pesoInferiorAQuarenta += 1;
            }
        }

        System.out.println("A quantidade de pessoas com idade superior a 50 anos e: " + idadeSuperiorCinquenta);
        System.out.println("A media das alturas das pessoas com idade entre 10 e 20 anos e: " + (alturaIdadeEntreDezEVinte / idadeEntreDezEVinte));
        System.out.println("A porcentagem de pessoas com peso inferior a 40Kg e: " + ((100 * pesoInferiorAQuarenta) / 5));

    }

}
