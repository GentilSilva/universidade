package exercicios.classeAula.vetores;

import java.util.Scanner;

public class AtividadeUmCorrecao {

    public static void main(String[] args) {

        String[] cidades = new String[20];
        int[] distancias = new int[20];
        String nomeCidadePesq;
        float precoVoo;
        int tempoVoo;
        byte qtdEscalas;
        Scanner leia = new Scanner(System.in);
        int cont;
        int i;
        boolean encontrou = false;

        for(cont = 0; cont < 20; cont++) {
            do {
                System.out.print("Digite o nome da cidade (FIM para encerrar): ");
                cidades[cont] = leia.nextLine();
                if(cidades[cont].equalsIgnoreCase("")) {
                    System.out.println("Nome de cidade obrigatorio!");
                }
            } while(cidades[cont].equalsIgnoreCase(""));

            if(cidades[cont].equalsIgnoreCase("FIM")) {
                break;
            }

            do {
                System.out.print("Digite a distancia ate Belo Horizonte: ");
                distancias[cont] = leia.nextInt();
                if(distancias[cont] < 500) {
                    System.out.println("Valor invalido, digite 500 ou maior.");
                }
            } while(distancias[cont] < 500);
        }

        do {
            System.out.print("Digite a cidade de destino (SAIR para encerrar): ");
            nomeCidadePesq = leia.nextLine();
            if(nomeCidadePesq.equalsIgnoreCase("SAIR")) {
                break;
            }

            for(i = 0; i < cont; i++) {
                if(nomeCidadePesq.equalsIgnoreCase(cidades[i])) {
                    encontrou = true;
                    break;
                }
            }

            if(encontrou) {
                precoVoo = (float) (distancias[i] * 0.25);
                tempoVoo = distancias[i] * 60 / 800;
                qtdEscalas = (byte) (tempoVoo / 180);

                System.out.println();
                System.out.println(String.format("""
						O preco da viagem e: R$%.2f.
						O tempo de viagem e: %.0f minutos.
						A quantidade de escalas feita foi: %d.
						""", precoVoo, tempoVoo, qtdEscalas));
            } else {
                System.out.println("Não existe voo para esta cidade!");
            }

        } while(!nomeCidadePesq.equalsIgnoreCase("SAIR"));

        leia.close();

    }

}
