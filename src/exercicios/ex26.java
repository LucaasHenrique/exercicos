package exercicios;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("digite um n: ");
        int n = in.nextInt();
        int menor, num;
        System.out.print("num: ");
        num = in.nextInt();
        menor = num;


        for (int c = 1; c<=n; c++){
            System.out.print("num: ");
            num = in.nextInt();
            if (num <= menor){
                menor = num;
            }
        }
        System.out.println("menor: " + menor);
    }
}