package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeDezessete {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int canal = 0;
        int pessoas = 0;
        double canalQuatro = 0;
        double canalCinco = 0;
        double canalSete = 0;
        double canalDoze = 0;
        int contador = 0;

        while(true) {
            System.out.print("Digite o canal assistido (4, 5, 7 12): ");
            canal = leia.nextInt();

            if(canal == 0) {
                break;
            }

            System.out.print("Digite a quantidade de pessoas assistindo: ");
            pessoas = leia.nextInt();

            if(canal == 4) {
                canalQuatro += pessoas;
                contador += pessoas;
            } else if(canal == 5) {
                canalCinco += pessoas;
                contador += pessoas;
            } else if(canal == 7) {
                canalSete += pessoas;
                contador += pessoas;
            } else if(canal == 12){
                canalDoze += pessoas;
                contador += pessoas;
            } else {
                System.out.println("Televisão desligada.");
            }
        }

        canalQuatro = (canalQuatro * 100) / contador;
        canalCinco = (canalCinco * 100) / contador;
        canalSete = (canalSete * 100) / contador;
        canalDoze = (canalDoze * 100) / contador;

        System.out.printf("""
                A porcentagem de audiência do canal 4 é: %.2f
                A porcentagem de audiência do canal 5 é: %.2f
                A porcentagem de audiência do canal 7 é: %.2f
                A porcentagem de audiência do canal 12 é: %.2f
                """, canalQuatro, canalCinco, canalSete, canalDoze);
    }
}
