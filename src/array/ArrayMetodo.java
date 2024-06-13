package array;
import java.util.Scanner;

public class ArrayMetodo {
    public static void exibeMat(int[][] mat) {
        System.out.println("\nA Matriz ficou: \n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("\t %d \t", mat[l][c]);
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Insira o elemento M[%d][%d]: ",l+1,c+1);
                matriz[l][c] = in.nextInt();
            }
        }

        exibeMat(matriz);
    }
}
