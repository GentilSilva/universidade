package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeCincoDois {

    public static void main(String[] args) {

        String codigo;
        boolean numeros;
        Scanner leia = new Scanner(System.in);

        do {
            numeros = true;
            System.out.print("Informe o digito: ");
            codigo = leia.nextLine();
            if(codigo.length() != 11) {
                System.out.println("O codigo deve ter 11 numeros.");
            }
            for(int i = 0; i < codigo.length(); i++) {
                if(Character.digit(codigo.charAt(i), 10) == -1) {
                    System.out.println("O codigo deve ter apenas valores numericos.");
                    numeros = false;
                    break;
                }
            }
        } while(codigo.length() != 11 || !numeros);

        boolean validados = validarDigitos(codigo);

        if(validados) {
            System.out.println("Digito correto!");
        } else {
            System.out.println("Digito invalido!.");
        }
    }

    private static boolean validarDigitos(String codigo) {
        int validaDigitoUm = 0;
        int validaDigitoDois = 1;
        boolean validados = false;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < codigo.length() - 2; j++) {
                if(i == 0) {
                    validaDigitoUm += Character.digit(codigo.charAt(j), 10);
                } else {
                    validaDigitoDois *= Character.digit(codigo.charAt(j), 10);
                }
            }
        }

        validaDigitoUm = validaDigitoUm / 10;
        validaDigitoDois = validaDigitoDois % 10;

        if(validaDigitoUm == Character.digit(codigo.charAt(codigo.length() - 2), 10)
                && validaDigitoDois == Character.digit(codigo.charAt(codigo.length() - 1), 10)) {
            validados = true;
        }

        return validados;
    }

}
