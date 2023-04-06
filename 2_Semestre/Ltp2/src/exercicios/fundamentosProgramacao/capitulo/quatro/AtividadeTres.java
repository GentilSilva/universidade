package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        primeiroNumero = leia.nextInt();
        System.out.print("Digite o segundo numero: ");
        segundoNumero = leia.nextInt();

        if(primeiroNumero < segundoNumero) {
            System.out.println("O menor numero e: " + primeiroNumero);
        } else {
            System.out.println("O menor numero e: " + segundoNumero);
        }

    }

}
