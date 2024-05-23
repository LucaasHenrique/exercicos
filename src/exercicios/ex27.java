package exercicios;

import java.util.Scanner;

public class ex27{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        n = in.nextInt();
        int p1 = 1, p2 = 1;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                p1 *= i;
            }
            else {
                p2 *= i;
            }
        }
        System.out.println("produto 1: " + p1);
        System.out.println("produto 2: " + p2);
    }
}
