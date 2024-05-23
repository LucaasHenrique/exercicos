package exercicios;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, c=0, maior, menor;

        System.out.print("Digite um numero: ");
        num = input.nextInt();
        maior = num;
        menor = num;

        while (c <= 10){
            System.out.print("Digite um numero: ");
            num = input.nextInt();
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
            c++;
        }
        System.out.printf("Maior, Menor: %d %d", maior, menor);
    }
}