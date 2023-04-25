package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeSeis {

    public static void main(String[] args) {

        char codigo;
        float valorTransacao;
        float valorAVista = 0;
        float valorAPrazo = 0;
        float totalCompras = 0;
        float valorPrimeirasPrestacoes = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 15; i++) {
            System.out.print("Digite o codigo da transacao (V - a vista) ou (P - a prazo): ");
            codigo = leia.next().charAt(0);

            System.out.print("Informe o valor da transacao: ");
            valorTransacao = leia.nextFloat();

            if(codigo == 'V') {
                valorAVista += valorTransacao;
                totalCompras += valorTransacao;
            } else if(codigo == 'P') {
                valorAPrazo += valorTransacao;
                totalCompras += valorTransacao;
                valorPrimeirasPrestacoes += valorTransacao / 3;
            } else {
                System.out.println("Codigo invalido.");
            }
        }

        System.out.println("O valor total das compras a vista e: R$" + valorAVista);
        System.out.println("O valor total das compras a prazo e: R$" + valorAPrazo);
        System.out.println("O valor total das compras efetuadas e: R$" + totalCompras);
        System.out.println("O valor da soma das primeiras prestacoes e: R$" + valorPrimeirasPrestacoes);

    }

}
