package autoInstrucional;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		String[][] agenda = new String[100][3];
		String dados;
		Scanner scan = new Scanner(System.in);
		int contador = 0;
		int opcao;

		do {

			System.out.print("Menu \n" + "1 - Para armazenar um novo contado \n" + "2 - Listar todos os contatos \n"
					+ "3 - Buscar contato por nome \n" + "4 - Sair \n" + "Selecione a opção: ");
			opcao = scan.nextInt();

//			Criação de contato
			if (opcao == 1) {
				if (contador < 100) {
					for (int i = contador; i < contador + 1;) {
						System.out.print("Digite em ordem: nome, e-mail e número de telefone. \n"
								+ "Pressione enter após cada informação digitada. \n");
						for (int j = 0; j < 3; j++) {
							System.out.print("Digite: ");
							dados = scan.next().toUpperCase();
							agenda[i][j] = dados;
						}
						contador++;
						break;
					}
				} else {
					System.out.println("Agenda cheia, não é possível adicionar mais contatos!");
				}

//			Listando todos os contatos
			} else if (opcao == 2) {
				for (int i = 0; i < agenda.length; i++) {
					String mensagem = "";
					for (int j = 0; j < 3; j++) {
						mensagem += "[" + agenda[i][j] + "]";
					}
					if (agenda[i][0] != null) {
						System.out.println(mensagem);
					}
				}

//			Pesquisando contatos por nome
			} else if (opcao == 3) {
				System.out.print("Digite o nome do contado desejado: ");
				dados = scan.next().toUpperCase();
				for (int i = 0; i < agenda.length; i++) {
					String mensagem = "";
					for (int j = 0; j < 3; j++) {
						mensagem += "[" + agenda[i][j] + "]";
					}
					if (dados.equals(agenda[i][0])) {
						System.out.println(mensagem);
					}
				}

//			Tratando erro de opção inexistente no menu
			} else if (opcao > 4) {
				System.out.println("Opção inválida!");
			}

		} while (opcao != 4);

		System.out.println("Aplicação encerrada");

		scan.close();

	}
}