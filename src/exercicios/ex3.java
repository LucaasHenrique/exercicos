package exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, maior, menor;

        System.out.print("Digite um numero: ");
        a = input.nextInt();
        System.out.print("Digite um numero: ");
        c = input.nextInt();
        System.out.print("Digite um numero: ");
        b = input.nextInt();

        maior = a;
        menor = a;

        if (b > maior){
            maior = b;
        }
        if (c > maior){
            maior = c;
        }

        if (b < menor){
            menor = b;
        }
        if (c < menor){
            menor = c;
        }

        System.out.printf("maior, menor: %d %d", maior, menor);
    }
}
