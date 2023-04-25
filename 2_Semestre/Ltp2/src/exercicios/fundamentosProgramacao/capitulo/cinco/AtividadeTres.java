package exercicios.fundamentosProgramacao.capitulo.cinco;

import java.util.Scanner;

public class AtividadeTres {

    public static void main(String[] args) {

        int idade;
        int primeiraFaixaEtaria = 0;
        int segundaFaixaEtaria = 0;
        int terceiraFaixaEtaria = 0;
        int quartaFaixaEtaria = 0;
        int quintaFaixaEtaria = 0;
        int totalPessoas = 0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 8; i++) {
            System.out.print("Informe a idade: ");
            idade = leia.nextInt();

            if(idade <= 15) {
                primeiraFaixaEtaria += 1;
                totalPessoas += 1;
            } else if(idade <= 30) {
                segundaFaixaEtaria += 1;
                totalPessoas += 1;
            } else if(idade <= 45) {
                terceiraFaixaEtaria += 1;
                totalPessoas += 1;
            } else if(idade <= 60) {
                quartaFaixaEtaria += 1;
                totalPessoas += 1;
            } else {
                quintaFaixaEtaria += 1;
                totalPessoas += 1;
            }
        }

        System.out.println("Quantidade de pessoas na primeira faixa etaria: " + primeiraFaixaEtaria);
        System.out.println("Quantidade de pessoas na segunda faixa etaria: " + segundaFaixaEtaria);
        System.out.println("Quantidade de pessoas na terceira faixa etaria: " + terceiraFaixaEtaria);
        System.out.println("Quantidade de pessoas na quarta faixa etaria: " + quartaFaixaEtaria);
        System.out.println("Quantidade de pessoas na quinta faixa etaria: " + quintaFaixaEtaria);

        System.out.println("Porcentagem de pessoas na primeira faixa etaria: " + ((100 * primeiraFaixaEtaria) / totalPessoas + "%"));
        System.out.println("Porcentagem de pessoas na ultima faixa etaria: " + ((100 * quintaFaixaEtaria) / totalPessoas) + "%");

    }

}
