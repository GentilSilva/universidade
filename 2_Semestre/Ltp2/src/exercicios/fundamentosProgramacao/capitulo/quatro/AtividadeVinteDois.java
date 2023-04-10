package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeVinteDois {

    public static void main(String[] args) {

        int idadeUsuario;
        float pesoUsuario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a idade do usuario: ");
        idadeUsuario = leia.nextInt();
        System.out.print("Informe o peso do usuario: ");
        pesoUsuario = leia.nextFloat();

        if(idadeUsuario < 20) {
            if(pesoUsuario <= 60) {
                System.out.print("O usuario se encontra no grupo de risco: 9");
            } else if(pesoUsuario <= 90) {
                System.out.print("O usuario se encontra no grupo de risco: 8");
            } else {
                System.out.print("O usuario se encontra no grupo de risco: 7");
            }
        } else if(idadeUsuario <= 50) {
            if(pesoUsuario <= 60) {
                System.out.print("O usuario se encontra no grupo de risco: 6");
            } else if(pesoUsuario <= 90) {
                System.out.print("O usuario se encontra no grupo de risco: 5");
            } else {
                System.out.print("O usuario se encontra no grupo de risco: 4");
            }
        } else {
            if(pesoUsuario <= 60) {
                System.out.print("O usuario se encontra no grupo de risco: 3");
            } else if(pesoUsuario <= 90) {
                System.out.print("O usuario se encontra no grupo de risco: 2");
            } else {
                System.out.print("O usuario se encontra no grupo de risco: 1");
            }
        }

    }

}
