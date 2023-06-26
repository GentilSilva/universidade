package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeDezesseis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double mediaIdades = 0;
        double contador = 0;
        double controle = 1 ;

        while(controle != 0) {
            System.out.print("Digite a idade: ");
            controle = leia.nextInt();

            if(controle != 0) {
                mediaIdades += controle;
                contador++;
            }
        }

        System.out.println("A média de idades é: " + (mediaIdades / contador));
    }
}
