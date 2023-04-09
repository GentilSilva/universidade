package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDezessete {

    public static void main(String[] args) {

        int senhaDigitada;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a senha. Somente numeros: ");
        senhaDigitada = leia.nextInt();

        if(senhaDigitada == 4531) {
            System.out.println("Senha correta, acesso concedido.");
        } else {
            System.out.println("Senha incorreta, acesso negado.");
        }

    }

}
