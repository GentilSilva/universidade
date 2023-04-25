package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        int[] grupoUm = new int[4];
        int[] grupoDois = new int[4];
        int[] grupoTres = new int[4];
        int[] grupoQuatro = new int[4];
        int[] grupoCinco = new int[4];
        int guardaValor;
        Scanner leia = new Scanner(System.in);

        // Entrada de valores
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print("Informa um valor para o primeiro grupo: ");
                    grupoUm[j] = leia.nextInt();
                } else if(i == 1) {
                    System.out.print("Informa um valor para o segundo grupo: ");
                    grupoDois[j] = leia.nextInt();
                } else if(i == 2) {
                    System.out.print("Informa um valor para o terceiro grupo: ");
                    grupoTres[j] = leia.nextInt();
                } else if(i == 3) {
                    System.out.print("Informa um valor para o quarto grupo: ");
                    grupoQuatro[j] = leia.nextInt();
                } else {
                    System.out.print("Informa um valor para o quinto grupo: ");
                    grupoCinco[j] = leia.nextInt();
                }
            }
            System.out.println();
        }

        // Imprime como foi recebido
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print(grupoUm[j] + " ");
                } else if(i == 1) {
                    System.out.print(grupoDois[j] + " ");
                } else if(i == 2) {
                    System.out.print(grupoTres[j] + " ");
                } else if(i == 3) {
                    System.out.print(grupoQuatro[j] + " ");
                } else {
                    System.out.print(grupoCinco[j] + " ");
                }
            }
            System.out.println();
        }

        // Organiza de forma crescente (Bubble Sort)
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 4 - 1; k++) {
                    if(i == 0) {
                        if(grupoUm[k] > grupoUm[k + 1]) {
                            guardaValor = grupoUm[k + 1];
                            grupoUm[k + 1] = grupoUm[k];
                            grupoUm[k] = guardaValor;
                        }
                    } else if(i == 1) {
                        if(grupoDois[k] > grupoDois[k + 1]) {
                            guardaValor = grupoDois[k + 1];
                            grupoDois[k + 1] = grupoDois[k];
                            grupoDois[k] = guardaValor;
                        }
                    } else if(i == 2) {
                        if(grupoTres[k] > grupoTres[k + 1]) {
                            guardaValor = grupoTres[k + 1];
                            grupoTres[k + 1] = grupoTres[k];
                            grupoTres[k] = guardaValor;
                        }
                    } else if(i == 3) {
                        if(grupoQuatro[k] > grupoQuatro[k + 1]) {
                            guardaValor = grupoQuatro[k + 1];
                            grupoQuatro[k + 1] = grupoQuatro[k];
                            grupoQuatro[k] = guardaValor;
                        }
                    } else {
                        if(grupoCinco[k] > grupoCinco[k + 1]) {
                            guardaValor = grupoCinco[k + 1];
                            grupoCinco[k + 1] = grupoCinco[k];
                            grupoCinco[k] = guardaValor;
                        }
                    }
                }
            }
        }

        System.out.println();
        // Imprime de forma crescente
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print(grupoUm[j] + " ");
                } else if(i == 1) {
                    System.out.print(grupoDois[j] + " ");
                } else if(i == 2) {
                    System.out.print(grupoTres[j] + " ");
                } else if(i == 3) {
                    System.out.print(grupoQuatro[j] + " ");
                } else {
                    System.out.print(grupoCinco[j] + " ");
                }
            }
            System.out.println();
        }

//        // Organiza de forma decrescente (bubble sorte)
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 4 - 1; k++) {
                    if(i == 0) {
                        if(grupoUm[k] < grupoUm[k + 1]) {
                            guardaValor = grupoUm[k];
                            grupoUm[k] = grupoUm[k + 1];
                            grupoUm[k + 1] = guardaValor;
                        }
                    } else if(i == 1) {
                        if(grupoDois[k] < grupoDois[k + 1]) {
                            guardaValor = grupoDois[k];
                            grupoDois[k] = grupoDois[k + 1];
                            grupoDois[k + 1] = guardaValor;
                        }
                    } else if(i == 2) {
                        if(grupoTres[k] < grupoTres[k + 1]) {
                            guardaValor = grupoTres[k];
                            grupoTres[k] = grupoTres[k + 1];
                            grupoTres[k + 1] = guardaValor;
                        }
                    } else if(i == 3) {
                        if(grupoQuatro[k] < grupoQuatro[k + 1]) {
                            guardaValor = grupoQuatro[k];
                            grupoQuatro[k] = grupoQuatro[k + 1];
                            grupoQuatro[k + 1] = guardaValor;
                        }
                    } else {
                        if(grupoCinco[k] < grupoCinco[k + 1]) {
                            guardaValor = grupoCinco[k];
                            grupoCinco[k] = grupoCinco[k + 1];
                            grupoCinco[k + 1] = guardaValor;
                        }
                    }
                }
            }
        }

        System.out.println();
        // Imprime de forma decrescente
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0) {
                    System.out.print(grupoUm[j] + " ");
                } else if(i == 1) {
                    System.out.print(grupoDois[j] + " ");
                } else if(i == 2) {
                    System.out.print(grupoTres[j] + " ");
                } else if(i == 3) {
                    System.out.print(grupoQuatro[j] + " ");
                } else {
                    System.out.print(grupoCinco[j] + " ");
                }
            }
            System.out.println();
        }

    }

}