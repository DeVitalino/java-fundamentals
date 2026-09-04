package fundamentals;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        //Exercicio 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = scanner.nextDouble();

        double fahrenheit = (temperatura * 9/5) + 32;
        double kelvin = temperatura + 273.15;

        System.out.println(temperatura + "°C equivalem a: " + fahrenheit + "°F");
        System.out.println(temperatura + "°C equivalem a: " + kelvin + "K");


    }
}
