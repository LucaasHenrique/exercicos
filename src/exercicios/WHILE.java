package exercicios;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam, c = 0;

        System.out.print("digite um tamanho: ");
        tam = input.nextInt();

        if (tam < 1 || tam > 20){
            System.out.println("valor invalido!!");
            return;

        }


        while (c <= tam){
            int c2 = 0;
            while (c2 != tam) {
                System.out.print(" * ");
                c2++;
            }
            System.out.println();
            c++;
        }
    }
}
