package fundamentals;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        //Exercicio 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota de Portugues: ");
        int Portugues = scanner.nextInt();

        System.out.println("Digite a nota de Matematica: ");
        int Matematica = scanner.nextInt();

        System.out.println("Digite a nota de Ciencia: ");
        int Ciencias = scanner.nextInt();

        int soma = Portugues + Matematica + Ciencias;

        int resultado = soma / 3;

        if (resultado >= 7) {
            System.out.println("Aprovado!");
        } else if (resultado >= 5 && resultado < 7) {
            System.out.println("Recruperação!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}

