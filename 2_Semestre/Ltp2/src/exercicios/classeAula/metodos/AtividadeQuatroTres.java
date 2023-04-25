package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeQuatroTres {

    static String[] cidades = {"BELO HORIZONTE", "SAO PAULO", "RIO DE JANEIRO", "SALVADOR", "CURITIBA"};

    public static void main(String[] args) {

        String[] nomesHospedes = new String[100];
        int diaEntrada;
        int diaSaida;
        String tipoQuarto;
        String cidade;
        float[] valoresContas = new float[100];
        Scanner leia = new Scanner(System.in);
        int contador;
        float somaContas = 0;
        float mediaContas;


        for(contador = 0; contador < 100; contador++) {

            System.out.print("Digite o nome do hospede ou digite FIM para encerrar o programa: ");
            nomesHospedes[contador] = leia.nextLine();
            if(nomesHospedes[contador].equalsIgnoreCase("FIM")) {
                break;
            }

            do {
                System.out.print("Digite o dia da entrada do hospede: ");
                diaEntrada = Integer.parseInt(leia.nextLine());
                System.out.print("Digite o dia da saida do hospede: ");
                diaSaida = Integer.parseInt(leia.nextLine());
                if(diaEntrada > diaSaida) {
                    System.out.println("O dia da saida deve ser maior que o da entrada.");
                }
            } while(diaEntrada > diaSaida);

            do {
                System.out.print("Digite o quarto escolhido: ");
                tipoQuarto = leia.nextLine();
                if(!tipoQuarto.equalsIgnoreCase("STANDARD") && !tipoQuarto.equalsIgnoreCase("LUXO") && !tipoQuarto.equalsIgnoreCase("SUPER-LUXO")) {
                    System.out.print("Quarto invalido. Escolha entre STANDARD, LUXO OU SUPER-LUXO");
                }
            } while(!tipoQuarto.equalsIgnoreCase("STANDARD") && !tipoQuarto.equalsIgnoreCase("LUXO") && !tipoQuarto.equalsIgnoreCase("SUPER-LUXO"));

            do {
                System.out.print("Digite a cidade do hotel: ");
                cidade = leia.nextLine();
                if(!cidadeEhValida(cidade)) {
                    System.out.println("Não existe hotel nessa cidade.");
                    System.out.println("Cidades esperada: BELO HORIZONTE, SAO PAULO, RIO DE JANEIRO, SALVADOR, CURITIBA");
                }
            } while(!cidadeEhValida(cidade));

            float valorConta = calcularConta(diaEntrada, diaSaida, tipoQuarto);
            valoresContas[contador] = valorConta;
            somaContas += valorConta;
        }

        mediaContas = somaContas / contador;

        System.out.println();
        for(int i = 0; i < contador; i++) {
            if(valoresContas[i] > mediaContas) {
                System.out.println("[" + nomesHospedes[i] + "  " + valoresContas[i] + "]");
            }
        }
    }

    public static float calcularConta(int entrada, int saida, String quarto) {
        float valorConta;
        if(quarto.equalsIgnoreCase("STANDARD")) {
            valorConta = (saida - entrada) * 120.0f;
        } else if(quarto.equalsIgnoreCase("LUXO")) {
            valorConta = (saida - entrada) * 150.0f;
        } else {
            valorConta = (saida - entrada) * 180.0f;
        }
        return valorConta;
    }

    public static boolean cidadeEhValida(String cidadeHotel) {
        boolean ehValida = false;
        for(int i = 0; i < cidades.length; i++) {
            if(cidadeHotel.equalsIgnoreCase(cidades[i])) {
                ehValida = true;
            }
        }
        return ehValida;
    }

}