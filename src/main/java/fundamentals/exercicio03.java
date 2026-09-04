package fundamentals;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        //Exercicio 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int m = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int n = scanner.nextInt();

        if (m > n) {
            System.out.println("M é Maior que N");
        } else if (m < n) {
            System.out.println("N é Maior que M");
        } else {
            System.out.println("Ambos possuem o mesmo valor!");
        }


    }
}
