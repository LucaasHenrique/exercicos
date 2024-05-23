package exercicios;

import java.util.Scanner;

// Objetivo: achar os maiores numeros usando laço while

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, c=0, maior, s_maior;

        System.out.print("digite um numero: ");
        num = input.nextInt();
        maior = num;
        s_maior = 0;

        while (c <= 4) {
            System.out.print("digite um numero: ");
            num = input.nextInt();

            if (num >= maior) {
                s_maior = maior;
                maior = num;
            }
            else if (num>=s_maior && num != maior){
                s_maior = num;
            }
            c++;
        }

        System.out.printf("maior valor: %d \n", maior);
        System.out.printf("segundo maior valor: %d", s_maior);
    }
}