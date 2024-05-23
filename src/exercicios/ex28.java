package exercicios;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("digite um numero: ");
        long fat = 1;
        int num = in.nextInt();

        for (int i = num; i >= 1; i--) {
            fat *= i;
        }
        System.out.printf("fatorial de %d é %d ", num, fat);
    }
}
