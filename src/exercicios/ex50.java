package exercicios;
import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;

        System.out.print("digite um numero: ");
        a = in.nextFloat();
        System.out.print("digite um numero: ");
        b = in.nextFloat();
        System.out.print("digite um numero: ");
        c = in.nextFloat();

        System.out.printf("maior numero: %.0f \n", maior(a, b, c));
        System.out.printf("menor numero: %.0f", menor(a, b, c));
    }
    public static float maior (float a, float b, float c) {
        float maior = Math.max(Math.max(a, b), c);
        return maior;
    }

    public static float menor (float a, float b, float c) {
        float menor = Math.min(Math.min(a, b), c);
        return menor;
    }
}
