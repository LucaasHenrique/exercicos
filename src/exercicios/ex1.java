package exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a, b, c, delta, rDelta, x1, x2;

        System.out.print("Digite a: ");
        a = input.nextFloat();
        System.out.print("Digite b: ");
        b = input.nextFloat();
        System.out.print("Digite c: ");
        c = input.nextFloat();

        if (a != 0) {
            delta = (b * b) - (4 * a * c);
            rDelta = (float) Math.sqrt(delta);

            if (rDelta >= 0) {
                x1 = (-b + rDelta) / (2 * a);
                x2 = (-b - rDelta) / (2 * a);
                System.out.printf("raizes: %.2f,  %.2f", x1, x2);
            }
            else {
                delta = -delta;
                rDelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (rDelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (rDelta)/(2*a));
            }
        }
        else {
            System.out.println("digite uma equaçao valida! ");
        }
    }
}
