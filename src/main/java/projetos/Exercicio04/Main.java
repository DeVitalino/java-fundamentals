package projetos.Exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double total = 0;
        double media = 0;
        double maior = Double.MAX_VALUE;
        double menor = Double.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("======== RELATÓRIO DE VENDAS ========");
        System.out.println("Data: ");
        String data = scanner.nextLine();
        System.out.println("Quantas vendas deseja registrar: ");
        int registro = scanner.nextInt();

        for (int i = 1; i <= registro; i++) {

            System.out.println("========RELATÓRIO DE VENDA(S)========\n" + "Data: " + data + "\n Quantidade de venda(s): " + registro + "\n\n");
            System.out.println("Venda " + i + ":");
            System.out.println("Valor: R$ ");
            double valor = scanner.nextDouble();
            if (valor > maior) { maior = valor; }
            if (valor < menor) { menor = valor; }

            total = total + valor;
            media = total / registro; }

        System.out.println("===== RELATÓRIO =====\n");
        System.out.println("Total: R$ " + total + "\n Média: R$" + media + "\n Maior Venda: R$ " + maior + "\n Menor Venda: R$ " + menor + "\n");


    }

}
