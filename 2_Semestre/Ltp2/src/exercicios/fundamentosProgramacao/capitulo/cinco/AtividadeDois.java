package exercicios.fundamentosProgramacao.capitulo.cinco;

public class AtividadeDois {

    public static void main(String[] args) {

        float vlrIngresso = 5.00f;
        int ingressosVendidos = 120;

        do {
            System.out.println("O lucro esperado com o valor do ingresso a " + vlrIngresso + " e: " + vlrIngresso * ingressosVendidos);
            vlrIngresso -= 0.5;
            ingressosVendidos += 26;
        } while(vlrIngresso >= 1);

    }

}
