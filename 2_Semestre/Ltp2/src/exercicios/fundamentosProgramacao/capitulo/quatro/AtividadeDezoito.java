package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDezoito {

    public static void main(String[] args) {

        int idade;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        idade = leia.nextInt();

        if(idade >= 18) {
            System.out.println("Usuario maior de idade.");
        } else {
            System.out.println("Usuario menor de idade.");
        }

    }

}
