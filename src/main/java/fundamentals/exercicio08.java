package fundamentals;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        //Exercicio 8
        Scanner scanner = new Scanner(System.in);

        int adicao = 0;

        System.out.println("Digite um numero: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            adicao = adicao + i;
        }

        System.out.println("O valor é: " + adicao);

    }
}
