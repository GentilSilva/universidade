package exercicios.classeAula.revisao.parteUm;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        float lado1;
        float lado2;
        float lado3;
        float somaLadosUmDois;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do menor lado: ");
        lado1 = scan.nextFloat();
        System.out.print("Digite o valor do segundo menor lado: ");
        lado2 = scan.nextFloat();
        System.out.print("Digite o valor do terceiro lado: ");
        lado3 = scan.nextFloat();

        somaLadosUmDois = lado1 + lado2;

        if(somaLadosUmDois < lado3) {
            System.out.println("Pelos valores passados, isto não é um triângulo.");
        } else if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("Este é um triângulo equilátero.");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Este é um triângulo isósceles.");
        } else {
            System.out.println("Este é um triângulo escaleno.");
        }

        scan.close();

    }

}
