package fundamentals;

import java.util.Scanner;

public class exercicio10 {

    public static void main (String[] adrgs) {

        //Fatorial

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= n; i++) {

            fatorial = (fatorial * i);

        }

        System.out.println(fatorial);



    }
}
