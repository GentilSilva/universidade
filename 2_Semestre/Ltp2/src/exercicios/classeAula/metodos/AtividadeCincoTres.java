package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeCincoTres {

    public static void main(String[] args) {

        String inicioChamada = "";
        String fimChamada = "";
        int horasInicio = 0;
        int minutosInicio = 0;
        int horasFim = 0;
        int minutosFim = 0;
        boolean condicao;
        Scanner leia = new Scanner(System.in);

        do {
            float custoChamada = 0;
            do {
                condicao = true;
                System.out.print("Informe o horario de inicio da chamada (HH:MM) ou (FIM para encerrar): ");
                inicioChamada = leia.nextLine();

                if(inicioChamada.equalsIgnoreCase("FIM")) {
                    break;
                }

                System.out.print("Informe o horario de encerramento da chamada (HH:MM): ");
                fimChamada = leia.nextLine();

                horasInicio = Integer.parseInt(inicioChamada.substring(0, 2));
                minutosInicio = Integer.parseInt(inicioChamada.substring(3));
                horasFim = Integer.parseInt(fimChamada.substring(0, 2));
                minutosFim = Integer.parseInt(fimChamada.substring(3));

                if(horasInicio >= horasFim && minutosInicio >= minutosFim) {
                    System.out.println("O horario de encerramento da chamada deve ser maior que o de inicio!");
                    condicao = false;
                }

            } while(!condicao);

            if(inicioChamada.equalsIgnoreCase("FIM")) {
                break;
            }

            if(validarHoras(inicioChamada) && validarHoras(fimChamada)) {
                if(horasInicio >= 18 || (horasInicio) >= 6 && horasInicio < 8) {
                    custoChamada = (horasFim - horasInicio) * 60 + minutosFim - minutosInicio;
                    custoChamada *= 0.15;
                } else if(horasInicio >= 8 && horasInicio < 18) {
                    custoChamada = (horasFim - horasInicio) * 60 + minutosFim - minutosInicio;
                    custoChamada *= 0.20;
                } else {
                    custoChamada = (horasFim - horasInicio) * 60 + minutosFim - minutosInicio;
                    custoChamada *= 0.1;
                }
                System.out.println("A chamada teve um valor de: R$" + custoChamada);
            } else {
                System.out.println("Horário incorreto!");
            }

        } while(!inicioChamada.equalsIgnoreCase("FIM"));

        leia.close();

    }

    private static boolean validarHoras(String horario) {
        boolean validado = true;
        String horas = horario.substring(0, 2);
        String minutos = horario.substring(3);

        int horasInt = Integer.parseInt(horas);
        int minutosInt = Integer.parseInt(minutos);

        if(horasInt < 0 || horasInt > 23) {
            validado = false;
        } else if(minutosInt < 0 || minutosInt > 59) {
            validado = false;
        }

        return validado;

    }

}