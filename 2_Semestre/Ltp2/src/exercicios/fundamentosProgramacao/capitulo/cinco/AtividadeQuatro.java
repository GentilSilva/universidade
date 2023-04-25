package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {

        int valor;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o o valor para calcular a tabuada: ");
        valor = leia.nextInt();

        System.out.println("A tabuada de " + valor + ":");
        for(int i = 0; i <= 10; i++) {
            System.out.println(valor + " * " + i + " = " + (valor * i) );
        }

    }

}
