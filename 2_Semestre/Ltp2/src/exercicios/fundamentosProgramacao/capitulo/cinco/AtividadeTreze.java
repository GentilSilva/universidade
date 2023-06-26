package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeTreze {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        double peso;
        double faixaUm = 0;
        int pesoUm = 0;
        double faixaDois = 0;
        int pesoDois = 0;
        double faixaTres = 0;
        int pesoTres = 0;
        double faixaQuatro = 0;
        int pesoQuatro = 0;

        for(int i = 0; i < 15; i++) {
            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
            System.out.print("Digite o peso da pessoa: ");
            peso = leia.nextDouble();

            if(idade > 0 && idade <= 10) {
                faixaUm += peso;
                pesoUm++;
            } else if(idade > 10 && idade <= 20) {
                faixaDois += peso;
                pesoDois++;
            } else if(idade > 20 && idade <= 30) {
                faixaTres += peso;
                pesoTres++;
            } else {
                faixaQuatro += peso;
                pesoQuatro++;
            }
            leia.nextLine();
        }

        faixaUm /= pesoUm;
        faixaDois /= pesoDois;
        faixaTres /= pesoTres;
        faixaQuatro /= pesoQuatro;

        System.out.printf("""
                A média de peso de 1 a 10 anos é: %.2f
                A média de peso de 11 a 20 anos é: %.2f
                A média de peso de 21 a 30 anos é: %.2f
                A média de peso acima de 30 anos é: %.2f
                %n""", faixaUm, faixaDois, faixaTres, faixaQuatro);

    }
}
