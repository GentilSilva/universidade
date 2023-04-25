package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeOito {

    public static void main(String[] args) {

        int idade;
        float peso;
        float altura;
        char corOlhos;
        char corCabelo;
        int pessoasIdadeEPeso = 0;
        float idadeRetalivaAltura = 0;
        int quantidadadeMenorQueUmECinquenta = 0;
        int quantidadeOlhosAzuis = 0;
        int ruivasENaoAzuis = 1;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 6; i++) {
            System.out.print("Informe a idade: ");
            idade = leia.nextInt();
            System.out.print("informe o peso: ");
            peso = leia.nextFloat();
            System.out.print("Informe a altura: ");
            altura = leia.nextFloat();
            System.out.print("Informe a cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            corOlhos = leia.next().charAt(0);
            System.out.print("Informe a cor do cabelo (P - preto, C - castanho, L - louro, R -ruivo): ");
            corCabelo = leia.next().charAt(0);

            if(idade > 50 && peso < 60) {
                pessoasIdadeEPeso += 1;
            }
            if(altura < 1.5) {
                idadeRetalivaAltura += idade;
                quantidadadeMenorQueUmECinquenta += 1;
            }
            if(corOlhos == 'A') {
                quantidadeOlhosAzuis += 1;
            }
            if(corCabelo == 'R' && corOlhos != 'A') {
                ruivasENaoAzuis += 1;
            }
        }

        System.out.println("A quantidade de pessoas com idade superior a 50 e peso inferior a 60kg e: " + pessoasIdadeEPeso);
        System.out.println("A media das idades das pessoas com altura inferior a 1.5m e: " + (idadeRetalivaAltura / quantidadadeMenorQueUmECinquenta));
        System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas e: " + (quantidadeOlhosAzuis * 100) / 6);
        System.out.println("A quantidade de pessoas ruivas e que nao  possuem olhos azuis e: " + ruivasENaoAzuis);

    }

}
