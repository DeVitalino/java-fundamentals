package projetos.Exercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contatos> contatos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("===== Lista Telefonica =====");
            System.out.println(" 1 - Adicionar Contato\n 2 - Contatos\n 3 - Buscar Contato\n 0 - Sair\n (Disque a opção desejada)");
            opcao = scanner.nextInt();
            scanner.nextLine(); // descarta a quebra de linha pendente do nextInt()

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();

                    contatos.add(new Contatos(nome, telefone));
                    System.out.println("Contato adicionado com sucesso!\n");
                    break;

                case 2:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.\n");
                    } else {
                        for (Contatos c : contatos) {
                            System.out.println(c.nome + " - " + c.telefone);
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome a buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Contatos c : contatos) {
                        if (c.nome.equalsIgnoreCase(busca)) {
                            System.out.println(c.nome + " - " + c.telefone);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.\n");
            }

        } while (opcao != 0);
    }
}