package fundamentals;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        byte n = scanner.nextByte();

        for( int i = 1; i <= 10; i++)

            System.out.println(n + " x " + i + " = " + (n * i));








    }

}
