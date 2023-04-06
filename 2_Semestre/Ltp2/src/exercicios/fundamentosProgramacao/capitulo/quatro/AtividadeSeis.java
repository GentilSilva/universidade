package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeSeis {

    public static void main(String[] args) {

        float primeiroNumero;
        float segundoNumero;
        int opcaoUsuario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Infome o primeiro numero: ");
        primeiroNumero = leia.nextFloat();
        System.out.print("Infome o segundo numero: ");
        segundoNumero = leia.nextFloat();
        System.out.println("Menu: 1 - Potencia, 2 - Raiz Quadrada, 3 - Raiz Cubica.");
        System.out.print("Escolha: ");
        opcaoUsuario = leia.nextInt();

        if(opcaoUsuario == 1) {
            System.out.println("A potencia do primeiro numero pelo segundo e: " + Math.pow(primeiroNumero, segundoNumero));
        } else if(opcaoUsuario == 2) {
            System.out.println("A raiz quadrada do primeiro numero e: " + Math.sqrt(primeiroNumero) + " e a raiz quadrada do segundo numero e: " + Math.sqrt(segundoNumero));
        } else if(opcaoUsuario == 3) {
            System.out.println("A raiz cubica do primeiro numero e: " + Math.cbrt(primeiroNumero) + " e a raiz cubica do segundo numero e: " + Math.cbrt(segundoNumero));
        } else {
            System.out.println("Opcao invalida.");
        }

    }

}
