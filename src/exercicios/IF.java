package exercicios;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, c = 0;

        System.out.print("Digite um numero: ");
        n = input.nextInt();

        while (c != n + 1){
            if (c % 2 == 0){
                System.out.println("par: " + c);
            }
            else{
                System.out.println("impar: " + c);
            }
            c++;
        }
    }
}
