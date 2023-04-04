package exercicios.fundamentosProgramacao.capitulo.um;

import java.util.Scanner;

public class AtividadeVinteCinco {

    public static void main(String[] args) {

        int horas;
        int minutos;
        int horasEmMinutos;
        int somaMinutos;
        int segundos;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        horas = leia.nextInt();
        System.out.print("Digite os minutos: ");
        minutos = leia.nextInt();

        horasEmMinutos = horas * 60;
        somaMinutos = minutos + horasEmMinutos;
        segundos = somaMinutos * 60;

        System.out.println("A quantidade de horas transformadas em minutos e: " + horasEmMinutos + "min, o total de" +
                " minutos ao somar e: " + somaMinutos + "min e tudo transformado em segundos e: " + segundos + "s.");

    }

}
