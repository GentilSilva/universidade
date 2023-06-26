package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeDoze {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int quantidadeNumerosPrimos = 0;

        for(int i = 0; i < 10; i++) {
            System.out.print("Informe um numero: ");
            numero = leia.nextInt();

            if(numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11) {
                quantidadeNumerosPrimos++;
            } else if(numero != 1) {
                if((numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0 && numero % 11 != 0)) {
                    quantidadeNumerosPrimos++;
                }
            }
        }

        System.out.println("A quantidade de números primos é: " + quantidadeNumerosPrimos);
    }
}
