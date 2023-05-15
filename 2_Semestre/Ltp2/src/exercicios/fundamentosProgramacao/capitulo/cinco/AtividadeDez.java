package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeDez {

    public static void main(String[] args) {

        int numero;
        int somaPares = 0;
        int somaPrimos = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("Informe um numero: ");
            numero = leia.nextInt();

            if(numero % 2 == 0) {
                somaPares += numero;
            }
            if(numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11) {
                somaPrimos += numero;
            } else if(numero != 1) {
                if((numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0 && numero % 11 != 0)) {
                    somaPrimos += numero;
                }
            }
        }

        System.out.println("A soma dos numeros pares e: " + somaPares);
        System.out.println("A soma do numeros primos e: " + somaPrimos);
    }

}
