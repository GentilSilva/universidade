package exercicios.classeAula.revisao.parteDois;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        float altura;
        char sexo;
        float maiorAltura = 0;
        float menorAltura = 0;
        int atletasFemininas = 0;
        int atletasMasculinos = 0;
        int quantidadeAtletas = 0;
        float mediaAlturaMasculina = 0;
        float mediaGeralAltura = 0;

        Scanner scan = new Scanner(System.in);

        int encerrar = 1;

        while(encerrar != 0) {

            do {
                System.out.print("Digite o sexo do atleta: ");
                sexo = scan.next().charAt(0);
            } while(sexo != 'M' && sexo != 'F');

            do {
                System.out.print("Digite a altura do atleta: ");
                altura = scan.nextFloat();
            } while(altura <= 0 || altura > 2.5f);

            if(quantidadeAtletas == 0) {
                menorAltura = altura;
            } else if(altura > maiorAltura) {
                maiorAltura = altura;
            } else if(altura < menorAltura) {
                menorAltura = altura;
            }

            if(sexo == 'F') {
                atletasFemininas += 1;
            } else  if(sexo == 'M') {
                mediaAlturaMasculina += altura;
                atletasMasculinos += 1;
            }

            mediaGeralAltura += altura;
            quantidadeAtletas += 1;

            System.out.print("Para encerrar o programa digite 0. Se deseja continuar, digite 1: ");
            encerrar = scan.nextInt();
        }

        mediaAlturaMasculina = mediaAlturaMasculina / atletasMasculinos;
        mediaGeralAltura = mediaGeralAltura / quantidadeAtletas;

        System.out.println(String.format("""
				A maior altura encontrada é: %.2f
				A menor altura encontrada é: %.2f
				o número de atletas femininos é: %d
				a média da altura masculina é: %.2f
				a média geral das alturas é: %.2f
				""", maiorAltura, menorAltura, atletasFemininas, mediaAlturaMasculina, mediaGeralAltura));

        scan.close();

    }

}
