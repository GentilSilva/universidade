package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;
        Scanner leia = new Scanner(System.in);


        System.out.print("Informe o primeiro numero: ");
        primeiroNumero = leia.nextInt();
        System.out.print("Informe o segundo numero: ");
        segundoNumero = leia.nextInt();
        System.out.print("Informe o terceiro numero: ");
        terceiroNumero = leia.nextInt();

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O maior numero e: " + primeiroNumero);
        } else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("O maior numero e: " + segundoNumero);
        } else if(primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("O maior numero e: " + primeiroNumero);
        } else {
            System.out.println("O maior numero e: " + terceiroNumero);
        }

    }

}
