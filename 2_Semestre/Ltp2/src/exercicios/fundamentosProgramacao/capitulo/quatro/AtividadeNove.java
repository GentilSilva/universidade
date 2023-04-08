package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeNove {

    public static void main(String[] args) {

        float saldoMedio;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o saldo medio do cliente: ");
        saldoMedio = leia.nextFloat();

        if(saldoMedio > 400) {
            System.out.println("O saldo medio e: " + saldoMedio + " e o valor do credito disponivel e: " + (saldoMedio * 0.3f));
        } else if(saldoMedio > 300) {
            System.out.println("O saldo medio e: " + saldoMedio + " e o valor do credito disponivel e: " + (saldoMedio * 0.25f));
        } else if(saldoMedio > 200) {
            System.out.println("O saldo medio e: " + saldoMedio + " e o valor do credito disponivel e: " + (saldoMedio * 0.2f));
        } else {
            System.out.println("O saldo medio e: " + saldoMedio + " e o valor do credito disponivel e: " + (saldoMedio * 0.1f));
        }

    }

}
