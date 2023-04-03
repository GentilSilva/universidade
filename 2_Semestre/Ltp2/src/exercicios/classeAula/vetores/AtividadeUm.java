package exercicios.classeAula.vetores;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        String[] cidades = new String[20];
        float[] distancia = new float[20];
        Scanner leia = new Scanner(System.in);
        int j;
        String cidadeDesejada;

        for(int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da cidade que pretende viajar ou Fim para terminar o programa:  ");
            cidades[i] = leia.nextLine();
            if(cidades[i].equalsIgnoreCase("Fim")) {
                break;
            } else {
                do {
                    if(cidades[i].equals("")) {
                        System.out.println("O nome da cidade e de preenchimento obrigatorio. Digite o nome da Cidade: ");
                        cidades[i] = leia.nextLine();
                    }
                } while(cidades[i].equalsIgnoreCase(""));

                do {
                    System.out.print("Digite a distancia da viagem: ");
                    distancia[i] = leia.nextFloat();
                    leia.nextLine();
                    if(distancia[i] < 500) {
                        System.out.println("A distancia ate Belo Horizonte tem que ser no minimo 500 Km");
                    }
                } while(distancia[i] < 500);
            }
        }

        do {

            float precoVoo = 0;
            float tempoVoo = 0;
            int qtdEscalas = 0;
            boolean encontrou = false;

            System.out.print("\nDigite o nome da cidade a ser procurada ou Fim para terminar o programa: ");
            cidadeDesejada = leia.nextLine();
            if(cidadeDesejada.equalsIgnoreCase("Fim")) {
                break;
            }

            for(j = 0; j < 20; j++) {
                if(cidadeDesejada.equalsIgnoreCase(cidades[j])) {
                    encontrou = true;
                    break;
                }
            }

            if(encontrou) {
                precoVoo = (float) (distancia[j] * 0.25);
                tempoVoo = distancia[j] / (800 / 60f);
                qtdEscalas = (int) tempoVoo / 180;

                System.out.println();
                System.out.println(String.format("""
						O preco da viagem e: R$%.2f.
						O tempo de viagem e: %.0f minutos.
						A quantidade de escalas feita foi: %d.
						""", precoVoo, tempoVoo, qtdEscalas));
            } else {
                System.out.println("Cidade nao encontrada na lista!");
            }

        } while(!cidadeDesejada.equalsIgnoreCase("Fim"));

        leia.close();

    }

}
