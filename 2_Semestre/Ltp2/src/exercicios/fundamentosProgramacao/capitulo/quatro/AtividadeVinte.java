package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeVinte {

    public static void main(String[] args) {

        int idadeNadador;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a idade do nadador: ");
        idadeNadador = leia.nextInt();

        if(idadeNadador < 5) {
            System.out.println("Não existe categoria para a idade do nadador.");
        } else if(idadeNadador <= 7) {
            System.out.println("A categoria para essa idade e: infantil");
        } else if(idadeNadador <= 10) {
            System.out.println("A categoria para essa idade e: juvenil");
        } else if(idadeNadador <= 15) {
            System.out.println("A categoria para essa idade e: adolescente");
        } else if(idadeNadador <= 30) {
            System.out.println("A categoria para essa idade e: adulto");
        } else {
            System.out.println("A categoria para essa idade e: senior");
        }

    }

}
