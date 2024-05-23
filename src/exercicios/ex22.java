package exercicios;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o tamanho: ");
        int tam = input.nextInt();

        for (int l=0; l<tam; l++){
            for (int c=0; c<tam; c++){
                if (l == 0 || l == tam - 1 || c == 0 || c == tam - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}