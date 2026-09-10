package projetos.exercicio01;

import java.util.Scanner;
import projetos.exercicio01.valores.*;

import static projetos.exercicio01.valores.*;

public class main {

    static void pausar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================\nOFICINA TECH");
        System.out.println("Para acessar a nossa página de orçamento precisamos do seu cadastro.\n===============================");

        pausar(2000);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("olá Sr(a). " + nome + " Qual serviço você deseja orçamentar?\n1 - Limpeza & Preventiva\n2 - Manutenção\n 3 - Peças\n (*digite o número referente ao serviço");
        String servico = scanner.nextLine();

        switch (servico) {

            case "1":

                System.out.println("Qual o modelo do aparelho: (CPU/Notebok/Videogame)");
                String aparelho = scanner.nextLine();

                if (aparelho.equals("CPU")) {

                    System.out.println("===============================\nOFICINA TECH\nORÇAMENTO\nNome do cliente: " + nome + "\nValor Bruto: " + bruto_cpu + "\n===============================");


                }

                else if (aparelho.equals("Notebook")) {

                    System.out.println("===============================\nOFICINA TECH\nORÇAMENTO\nNome do cliente: " + nome + "\nValor Bruto: " + bruto_notebook + "\n===============================");

                }

                else if (aparelho.equals("Videogame")) {

                    System.out.println("===============================\nOFICINA TECH\nORÇAMENTO\nNome do cliente: " + nome + "\nValor Bruto: " + bruto_videogame + "\n===============================");

                }

                break;

            case "2":

                System.out.println("Qual manutenção você deseja: (Geral/Expecifica)");
                String manutencao = scanner.nextLine();

                if (manutencao.equals("geral")) {

                    System.out.println("===============================\nOFICINA TECH\nORÇAMENTO MANUTENÇÃO\nNome do cliente: " + nome + "\nValor Bruto: " + manutencao_geral + "\n===============================");

                }

                else if (manutencao.equals("expecifica")) {

                    System.out.println("===============================\nOFICINA TECH\nORÇAMENTO MANUTENÇÃO\nNome do cliente: " + nome + "\nValor Bruto: " + manutencao_exp + "\n===============================");

                }

                break;



            case "3":

        }







    }


}
