package exercicios;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior, s_maior;

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        maior = num;
        s_maior = 0;

        for (int i = 1; i <= 7; i++){
            System.out.print("Digite um numero: ");
            num = input.nextInt();
            if (num >= maior) {
                s_maior = maior;
                maior = num;
            } else if ((num >= s_maior) && (num != maior)){
                s_maior = num;
            }
        }
        System.out.println("maior: " + maior);
        System.out.println("segundo maior: " + s_maior);
    }
}