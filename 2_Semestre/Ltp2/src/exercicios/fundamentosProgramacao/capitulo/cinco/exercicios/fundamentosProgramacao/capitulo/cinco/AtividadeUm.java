package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {
        
        int[] grupoUm = new int[4];
        int[] grupoDois = new int[4];
        int[] grupoTres = new int[4];
        int[] grupoQuatro = new int[4];
        int[] grupoCinco = new int[4];
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print("Informa um valor para o primeiro grupo: ");
                    grupoUm[i] = leia.nextInt();
                } else if(i == 1) {
                    System.out.print("Informa um valor para o segundo grupo: ");
                    grupoDois[i] = leia.nextInt();
                } else if(i == 2) {
                    System.out.print("Informa um valor para o terceiro grupo: ");
                    grupoTres[i] = leia.nextInt();
                } else if(i == 3) {
                    System.out.print("Informa um valor para o quarto grupo: ");
                    grupoQuatro[i] = leia.nextInt();
                } else {
                    System.out.print("Informa um valor para o quinto grupo: ");
                    grupoCinco[i] = leia.nextInt();
                }
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print(grupoUm[i] + " ");
                } else if(i == 1) {
                    System.out.print(grupoDois[i] + " ");
                } else if(i == 2) {
                    System.out.print(grupoTres[i] + " ");
                } else if(i == 3) {
                    System.out.print(grupoQuatro[i] + " ");
                } else {
                    System.out.print(grupoCinco[i] + " ");
                }
            }
        }

    }

}