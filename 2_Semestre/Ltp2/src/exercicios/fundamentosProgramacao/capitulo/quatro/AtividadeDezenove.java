package exercicios.fundamentosProgramacao.capitulo.quatro;

import java.util.Scanner;

public class AtividadeDezenove {

    public static void main(String[] args) {

        float alturaUsuario;
        String sexoUsuario;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a altura do usuario: ");
        alturaUsuario = leia.nextFloat();
        System.out.print("Informe o sexo do usuario: ");
        sexoUsuario = leia.next();

        if(sexoUsuario.equalsIgnoreCase("feminino")) {
            System.out.println("O peso ideal do usuario e: " + ((62.1 * alturaUsuario) - 44.7));
        } else if(sexoUsuario.equalsIgnoreCase("masculino")) {
            System.out.println("O peso ideal do usuario e: " + ((72.7 * alturaUsuario) - 58));
        }

    }

}
