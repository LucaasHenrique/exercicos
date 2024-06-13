package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] lista = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("digite o numero %d: ", (i + 1));
            lista[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(lista));

        for (int i = 0; i < 3; i++) {
            System.out.printf("numero %d --> %d \n", (i+1), lista[i]);
        }
    }
}
