package exercicios.classeAula.metodos;

import java.util.Scanner;

public class AtividadeCincoQuatro {

    public static void main(String[] args) {

        String placaVeiculo;
        String placaMenorMulta = "";
        String dataMulta;
        float valorMulta;
        float somaMultas = 0;
        float menorMulta = 0;
        int quantidadeMultas = 0;
        Scanner leia = new Scanner(System.in);

        do {
            boolean verificaPlaca = true;
            do {
                System.out.print("Informe a placa do veiculo ou (FIM para encerrar): ");
                placaVeiculo = leia.nextLine();
                
                if(placaVeiculo.equalsIgnoreCase("FIM")) {
                    break;
                }

                if(placaVeiculo.length() != 7) {
                    System.out.println("A placa deve conter 7 caracteres.");
                    verificaPlaca = false;
                    break;
                }

                for(int i = 0; i < placaVeiculo.length(); i++) {
                    if(i == 0 || i == 1 || i == 2) {
                        if(Character.digit(placaVeiculo.charAt(i), 10) != -1) {
                            System.out.println("Formato invalido, os tres primeiros caracteres devem ser letras.");
                            verificaPlaca = false;
                            break;
                        }
                    } else {
                        if(Character.digit(placaVeiculo.charAt(i), 10) == -1) {
                            System.out.println("Formato invalido, os 4 ultimos caracteres devem ser numeros.");
                            verificaPlaca = false;
                            break;
                        }
                    }
                }
            } while(!verificaPlaca);
            if(placaVeiculo.equalsIgnoreCase("FIM")) {
                break;
            }

            do {
                System.out.print("Informe da data da multa: ");
                dataMulta = leia.nextLine();
            } while(!dataEhValida(dataMulta));

            do {
                System.out.print("Informe o valor da multa: ");
                valorMulta = leia.nextFloat();

                if(valorMulta <= 0) {
                    System.out.println("O valor da multa deve ser maior que zero.");
                }
            } while(valorMulta <= 0);
            leia.nextLine();
            
            quantidadeMultas += 1;
            somaMultas += valorMulta;
            
            if(menorMulta == 0) {
                placaMenorMulta = placaVeiculo;
                menorMulta = valorMulta;
            } else if(valorMulta < menorMulta) {
                placaMenorMulta = placaVeiculo;
                menorMulta = valorMulta;
            }
        } while(true);

        System.out.println("A soma dos valores das multas e: " + somaMultas);
        System.out.println("O valor da menor multa e: " + menorMulta + " de veiculo de placa: " + placaMenorMulta);
        System.out.println("O valor medio da multa e: " + (somaMultas / quantidadeMultas));
        
    }

    public static boolean dataEhValida(String data) {
        int dia, mes, ano;

        if(data.length() != 10) {
            System.out.println("Data invalida, deve possuir 10 caracteres. Ex: (DD/MM/AAAA).");
            return false;
        }

        if(data.charAt(2) != '/' || data.charAt(5) != '/') {
            System.out.println("Formato invalido. Data valida no formato (DD/MM/AAAA).");
            return false;
        }

        try {
            dia = Integer.parseInt(data.substring(0, 2));
            mes = Integer.parseInt(data.substring(3, 5));
            ano = Integer.parseInt(data.substring(6));
        } catch(NumberFormatException exception) {
            System.out.println("Data invalida, data, mes e ano devem ser numericos.");
            return false;
        }

        if(mes < 1 || mes > 12) {
            System.out.println("O mes deve estar entre 1 e 12");
            return false;
        }

        if(ano > 2023) {
            System.out.println("O ano deve ser menor ou igual a 2023.");
            return false;
        }

        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if(dia < 1 || dia > 30) {
                System.out.println("Os meses de (Abril, Junho, setembro e Novembro " +
                        "devem ter de 1 a 30 dias.");
                return false;
            }
        } else if(mes == 2) {
            if((ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
               if(dia < 1 || dia > 29) {
                   System.out.println("Em ano bissexto o mes de Fevereiro possui de 1 a 29 dias.");
                   return false;
               }
            } else {
                if(dia < 1 || dia > 28) {
                    System.out.println("Em ano nao bissexto o mes de Fevereiro possui de 1 a 28 dias.");
                    return false;
                }
            }
        } else {
            if(dia < 1 || dia > 31) {
                System.out.println("Os meses de (Janeiro, Marco, Maio, Julho, Agosto, Outubro e Dezembro " +
                        "devem ter de 1 a 31 dias.");
                return false;
            }
        }
        return true;
    }

}
