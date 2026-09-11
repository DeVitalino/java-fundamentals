package projetos.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<agendamentos> listaAgendamentos = new ArrayList<>();
        int totalAgendamentos = 0;
        int atendimento = 190;

        int menu;

        do {

            System.out.println("================================\n" + "ASSISTÊNCIA TECH\n" + "================================");
            System.out.println("1 - Registrar atendimento");
            System.out.println("2 - Ver resumo");
            System.out.println("0 - Sair");
            menu = scanner.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Escolha: 1\n" +
                        "Valor do antendimento: R$ " + atendimento + "\n" +
                            "Deseja confirmar o agendamento: (S/N)");
                    String agendamento = scanner.next();

                    if (agendamento.equals("S")) {

                        System.out.println("Informe o nome do paciente: ");
                        String nome = scanner.next();
                        System.out.println("Informe o telefone do paciente: ");
                        String telefone = scanner.next();

                        totalAgendamentos++;

                        listaAgendamentos.add(new agendamentos(totalAgendamentos, nome, telefone));

                        System.out.println("Atendimento agendado com sucesso!"); }


                    else if (agendamento.equals("N")) { System.out.println("Atendimento cancelado!"); }

                    break;

                case 2:
                    System.out.println("===== RESUMO DOS AGENDAMENTOS =====");

                    if (listaAgendamentos.isEmpty()) {
                        System.out.println("Nenhum agendamento realizado.");
                    }

                    else { System.out.println("Total de Agendamentos: " + listaAgendamentos);

                    for (agendamentos ag : listaAgendamentos) {
                        System.out.println(ag); } }

                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (menu != 0);

        scanner.close();

    }
}
