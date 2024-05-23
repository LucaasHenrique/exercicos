package exercicios;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam;

        System.out.print("Digite o tamanho: ");
        tam = input.nextInt();

        int l = 0;
        while (l < tam) {
            int c = 0;
            while (c < tam) {
                if (l == 0 || l == tam - 1 || c == 0 || c == tam - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println();
            l++;
        }
    }
}