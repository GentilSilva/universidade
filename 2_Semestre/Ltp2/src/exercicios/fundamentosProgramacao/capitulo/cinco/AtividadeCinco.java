package exercicios.fundamentosProgramacao.capitulo.cinco;

public class AtividadeCinco {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println("A tabuada de " + i + ":");
            for(int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j) );
            }
        }

    }

}
