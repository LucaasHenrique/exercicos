package exercicios;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior;

        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        maior = num;

        for (int i = 1; i <= 7; i++){
            System.out.print("Digite um numero: ");
            num = input.nextInt();
            if (num >= maior){
                maior = num;
            }
        }
        System.out.println("maior: " + maior);
    }
}