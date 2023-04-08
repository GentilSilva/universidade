package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDez {

    public static void main(String[] args) {

        float custoFabrica;
        float porcentagemDistribuidor;
        float imposto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o preco de fabrica: ");
        custoFabrica = leia.nextFloat();

        if(custoFabrica <= 12000) {
            System.out.println("O valor do carro para o consumidor e: " + (custoFabrica * 1.05));
        } else if(custoFabrica <= 25000) {
            System.out.println("O valor do carro para o consumidor e: " + (custoFabrica * 1.25));
        } else {
            System.out.println("O valor do carro para o consumidor e: " + (custoFabrica * 1.35));
        }

    }

}
