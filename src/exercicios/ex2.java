package exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, diametro, comp, pi = 3.14;

        System.out.print("digite o raio: ");
        raio = input.nextFloat();

        diametro = raio*2;
        comp = 2*pi*raio;

        System.out.printf("diametro: %.2f \n", diametro);
        System.out.printf("comprimento: %.2f", comp);

    }
}
