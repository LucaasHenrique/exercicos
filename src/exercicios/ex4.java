package exercicios;

import java.util.Scanner;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random num = new Random();

        int tentativa;

        int num_random = num.nextInt(10) + 1;

        System.out.print("Sua tentativa: ");
        tentativa = input.nextInt();

        if (tentativa == num_random){
            System.out.println("Você acertou!!");
        }
        else{
            System.out.println("Você errou!!");
        }

    }
}