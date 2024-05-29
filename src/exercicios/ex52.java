package exercicios;
import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op;
        float temp;

        System.out.println("ler em celsius ou farenheit: ");
        op = in.nextLine().charAt(0);

        System.out.println("digite a temperatura: ");
        temp = in.nextFloat();

        switch (op) {
            case 'C': case 'c':
                System.out.println("temperatura de celsius para farenheit: " + celsiusFarenheit(temp));
                break;
            case 'F': case 'f':
                System.out.println("temperatura de farenheit para celsius: " + farenheitCelsius(temp));
        }

    }

    public static float celsiusFarenheit (float temp) {
        return (float) ((temp * 1.8) + 32);
    }

    public static float farenheitCelsius (float temp) {
        return (float) ((temp - 32) / 1.8);
    }
}
