package exercicios.fundamentosProgramacao.capitulo.quatro;

import javax.swing.*;
import java.util.Scanner;

public class AtividadeVinteQuatro {

    public static void main(String[] args) {

        float preco;
        int categoria;
        char situacao;
        float novoPreco = 0;
        float imposto;
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        preco = leia.nextFloat();
        System.out.print("Escolha entre as seguintes categorias: 1 - Limpeza, 2 - Alimentacao, 3 - Vestuario");
        System.out.print("Digite: ");
        categoria = leia.nextInt();
        System.out.print("Informe a situacao: R - produtos que necessitam regrigeracao, N - produtos que nao necessitam de refrigeracao");
        System.out.print("Digite: ");
        situacao = leia.next().charAt(0);

        if(preco <= 25) {
            if(categoria == 1) {
                novoPreco = preco * 1.05f;
            } else if(categoria == 2) {
                novoPreco = preco * 1.08f;
            } else {
                novoPreco = preco * 1.1f;
            }
        } else if(preco > 25) {
            if(categoria == 1) {
                novoPreco = preco * 1.12f;
            } else if(categoria == 2) {
                novoPreco = preco * 1.15f;
            } else {
                novoPreco = preco * 1.18f;
            }
        }

        if(categoria == 2 || situacao == 'R') {
            imposto = preco * 0.05f;
        } else {
            imposto = preco * 0.08f;
        }

        novoPreco = novoPreco - imposto;

        if(novoPreco <= 50) {
            System.out.print("O valor do produto e: " + novoPreco + " e sua classificacao e: BARATO");
        } else if(novoPreco <= 120) {
            System.out.print("O valor do produto e: " + novoPreco + " e sua classificacao e: NORMAL");
        } else {
            System.out.print("O valor do produto e: " + novoPreco + " e sua classificacao e: CARO");
        }

    }

}
