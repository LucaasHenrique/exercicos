package exercicios;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o tamanho: ");
        int tam = input.nextInt();

        for (int l=1; l<=tam; l++){
            for (int c=1; c<=tam; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}