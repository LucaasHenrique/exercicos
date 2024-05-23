package exercicios;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int p = input.nextInt();

        for (int d = p; d >= 0; d--){
            int p_fim = d - 1;
            if (p_fim > -1) {
                System.out.printf("%d - %d\n", d, p_fim);
            }
        }
    }
}