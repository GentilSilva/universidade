package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeQuatroQuatro {

    public static void main(String[] args) {

        String jogadorUm;
        String jogadorDois;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.print("Digite a jogada do jogador 1: ");
            jogadorUm = leia.nextLine();
            System.out.print("Digite a jogada do Jogador 2: ");
            jogadorDois = leia.nextLine();
            System.out.println();

            if((jogadorUm.equalsIgnoreCase("TESOURA") || jogadorUm.equalsIgnoreCase("PEDRA") || jogadorUm.equalsIgnoreCase("PAPEL"))
                    && (jogadorDois.equalsIgnoreCase("TESOURA") || jogadorDois.equalsIgnoreCase("PEDRA") || jogadorDois.equalsIgnoreCase("PAPEL"))) {
                verificaVencedor(jogadorUm, jogadorDois);
            }

        } while((jogadorUm.equalsIgnoreCase("TESOURA") || jogadorUm.equalsIgnoreCase("PEDRA") || jogadorUm.equalsIgnoreCase("PAPEL"))
                && (jogadorDois.equalsIgnoreCase("TESOURA") || jogadorDois.equalsIgnoreCase("PEDRA") || jogadorDois.equalsIgnoreCase("PAPEL")));

        System.out.println("Jogo terminado.");

        leia.close();

    }

    public static void verificaVencedor(String escolhaJogadorUm, String escolhaJogadorDois) {
        if(escolhaJogadorUm.equalsIgnoreCase("PEDRA")) {
            if(escolhaJogadorDois.equalsIgnoreCase("PEDRA")) {
                System.out.println("O jogo empatou!\n");
            } else if(escolhaJogadorDois.equalsIgnoreCase("PAPEL")) {
                System.out.println("Jogador 2 venceu o jogo!\n");
            } else {
                System.out.println("Jogador 1 venceu o jogo!\n");
            }
        } else if(escolhaJogadorUm.equalsIgnoreCase("PAPEL")) {
            if(escolhaJogadorDois.equalsIgnoreCase("PEDRA")) {
                System.out.println("Jogador 1 venceu o jogo!\n");
            } else if(escolhaJogadorDois.equalsIgnoreCase("PAPEL")) {
                System.out.println("O jogo empatou!\n");
            } else {
                System.out.println("Jogador 2 venceu o jogo!\n");
            }
        } else {
            if(escolhaJogadorDois.equalsIgnoreCase("PEDRA")) {
                System.out.println("Jogador 2 venceu o jogo!\n");
            } else if(escolhaJogadorDois.equalsIgnoreCase("PAPEL")) {
                System.out.println("Jogador 1 venceu o jogo!\n");
            } else {
                System.out.println("O jogo empatou!\n");
            }
        }

    }

}
