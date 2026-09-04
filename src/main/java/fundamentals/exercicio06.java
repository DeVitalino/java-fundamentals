package fundamentals;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        //Exercicio 6
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação você deseja realizar: ");
        String operacao = scanner.nextLine();

        switch (operacao) {

            case "soma":

                System.out.println("Digite o primeiro numero: ");
                int soma1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int soma2 = scanner.nextInt();

                int soma_resultado = (soma1 + soma2);

                System.out.println("A soma da operação é: " + soma_resultado);
                break;

            case "subtracao":

                System.out.println("Digite o primeiro numero:");
                int sub1 = scanner.nextInt();

                System.out.println("Digite o segundo numero:");
                int sub2 = scanner.nextInt();

                int sub_resultado = (sub1 - sub2);

                System.out.println("O resultado da operação é: " + sub_resultado);
                break;

            case "multiplicacao":

                System.out.println("Digite o primeiro numero:");
                int mul1 = scanner.nextInt();

                System.out.println("Digite o segundo numero:");
                int mul2 = scanner.nextInt();

                int multi_resultado = (mul1 * mul2);

                System.out.println("O resultado da operação é: " + multi_resultado);
                break;

            case "divisao":

                System.out.println("Digite o primeiro numero:");
                int div1 = scanner.nextInt();

                System.out.println("Digite o segundo numero:");
                int div2 = scanner.nextInt();

                int div_resultado = (div1 / div2);
                System.out.println("O resultado da operação é: " + div_resultado);
                break;

        }

    }
}
