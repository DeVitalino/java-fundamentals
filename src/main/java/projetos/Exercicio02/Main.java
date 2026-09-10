package projetos.Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================\n" +
                "LANCHONETE DO ZÉ\n" +
                "PROTOCOLO DE VENDA\n" +
                "===============================");

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor da compra: R$ ");
        double compra = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("==============================\n" +
                "LANCHONETE DO ZÉ\n" +
                "===============================\n" +
                "Cliente: " + nome + "\n" +
                "Valor da compra: R$ " + compra + "\n\n" +
                "Forma de pagamento: \n" +
                "1 - PIX (5% de desconto)\n" +
                "2 - Dinheiro\n" +
                "3 - Cartão\n" +
                "Digite o número referente ao pagamento:");

        int pagamento = scanner.nextInt();
        scanner.nextLine();

        switch (pagamento) {

            case 1:

                double desconto = (compra * 0.05);
                double pix = compra - desconto;

                System.out.println("==============================\n" +
                        "LANCHONETE DO ZÉ\n" +
                        "===============================\n" +
                        "Cliente: " + nome + "\n" +
                        "Valor da compra: R$ " + compra + "\n\n" +
                        "Forma de Pagamento: PIX\n" +
                        "Desconto: R$ " + desconto + "\n" +
                        "Total: R$ " + pix + "\n");

                break;

            case 2:

                System.out.println("==============================\n" +
                        "LANCHONETE DO ZÉ\n" +
                        "===============================\n" +
                        "Cliente: " + nome + "\n" +
                        "Valor da compra: R$ " + compra + "\n\n" +
                        "Forma de Pagamento: Dinheiro\n" +
                        "Precisa de troco? (S/N):");

                String troco = scanner.nextLine();

                if (troco.equalsIgnoreCase("S")) {

                    System.out.println("Qual o valor pago? ");
                    double dinheiro_pago = scanner.nextDouble();

                    if (dinheiro_pago >= compra) {

                        double dinheiro_troco = dinheiro_pago - compra;

                        System.out.println("==============================\n" +
                                "LANCHONETE DO ZÉ\n" +
                                "===============================\n" +
                                "Cliente: " + nome + "\n" +
                                "Valor da compra: R$ " + compra + "\n\n" +
                                "Forma de Pagamento: Dinheiro\n" +
                                "Valor pago: R$ " + dinheiro_pago + "\n" +
                                "Troco: R$ " + dinheiro_troco + "\n");

                    } else {

                        System.out.println("Valor pago insuficiente para realizar a compra.");

                    }

                } else if (troco.equalsIgnoreCase("N")) {

                    System.out.println("==============================\n" +
                            "LANCHONETE DO ZÉ\n" +
                            "===============================\n" +
                            "Cliente: " + nome + "\n" +
                            "Valor da compra: R$ " + compra + "\n\n" +
                            "Forma de Pagamento: Dinheiro\n" +
                            "Total: R$ " + compra + "\n");

                } else {

                    System.out.println("Opção inválida! Digite apenas S ou N.");

                }

                break;

            case 3:

                System.out.println("==============================\n" +
                        "LANCHONETE DO ZÉ\n" +
                        "===============================\n" +
                        "Cliente: " + nome + "\n" +
                        "Valor da compra: R$ " + compra + "\n\n" +
                        "Forma de pagamento: Cartão\n" +
                        "(Crédito ou Débito: C/D)");

                String funcao = scanner.nextLine();

                if (funcao.equalsIgnoreCase("C")) {

                    double acr = (compra * 0.05);
                    double credito = compra + acr;

                    System.out.println("==============================\n" +
                            "LANCHONETE DO ZÉ\n" +
                            "===============================\n" +
                            "Cliente: " + nome + "\n" +
                            "Valor da compra: R$ " + compra + "\n\n" +
                            "Total: R$ " + credito + "\n" +
                            "Forma de pagamento: Cartão de Crédito\n" +
                            "Taxa de acréscimo: 5%\n");

                } else if (funcao.equalsIgnoreCase("D")) {

                    System.out.println("==============================\n" +
                            "LANCHONETE DO ZÉ\n" +
                            "===============================\n" +
                            "Cliente: " + nome + "\n" +
                            "Valor da compra: R$ " + compra + "\n\n" +
                            "Forma de pagamento: Cartão de Débito\n" +
                            "Total: R$ " + compra + "\n");

                } else {

                    System.out.println("Opção inválida! Digite apenas C ou D.");

                }

                break;

            default:

                System.out.println("Opção de pagamento inválida!");

                break;
        }

        scanner.close();

        System.out.println("Obrigado por comprar conosco!\n" +
                "LANCHONETE DO ZÉ");

    }

}