package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeCinco {

    public static void main(String[] args) {

        float primeiroNumero;
        float segundoNumero;
        int opcaoUsuario;
        Scanner leia = new Scanner(System.in);


        System.out.print("Informe o primeiro numero: ");
        primeiroNumero = leia.nextFloat();
        System.out.print("Informe o segundo numero: ");
        segundoNumero = leia.nextFloat();
        System.out.println("Menu: 1 - Media, 2 - Diferenca, 3 - Produto, 4 - Divisao.");
        System.out.print("Escolha: ");
        opcaoUsuario = leia.nextInt();

        if(opcaoUsuario == 1) {
            System.out.println("A media entre os valores e: " + ((primeiroNumero + segundoNumero) / 2));
        } else if(opcaoUsuario == 2) {
            if(primeiroNumero > segundoNumero) {
                System.out.println("A diferenca e: " + (primeiroNumero - segundoNumero));
            } else {
                System.out.println("A diferenca e: " + (segundoNumero - primeiroNumero));
            }
        } else if(opcaoUsuario == 3) {
            System.out.println("O produto entre os dois numeros e: " + (primeiroNumero * segundoNumero));
        } else if(opcaoUsuario == 4) {
            if(segundoNumero == 0) {
                System.out.println("Divisao invalida, segundo numero deve ser diferente de 0");
            } else {
                System.out.println("A divisao entre os numeros e: " + (primeiroNumero / segundoNumero));
            }
        } else {
            System.out.println("Opcao invalida.");
        }

    }

}
