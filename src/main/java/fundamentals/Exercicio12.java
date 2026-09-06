package fundamentals;

import java.util.Scanner;

    public class Exercicio12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int invertido = 0;

            while (numero != 0) {
                int ultimoDigito = numero % 10;
                invertido = invertido * 10 + ultimoDigito;
                numero = numero / 10;
            }

            System.out.println("Número invertido: " + invertido);

            scanner.close();
        }
    }

