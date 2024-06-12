package array.array;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizz = new int[3][2];

        Scanner in = new Scanner(System.in);
        /*System.out.println("Matriz M[3][3]\n");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Insira o elemento M[%d][%d]: ",l+1,c+1);
                matriz[l][c] = in.nextInt();
            }
        }

        System.out.println("\nA Matriz ficou: \n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("\t %d \t", matriz[l][c]);
            }
            System.out.println( );
        }*/

        // matriz de 3x2
        System.out.println("Matriz M[3][2]\n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.printf("Insira o elemento M[%d][%d]: ",l+1,c+1);
                matrizz[l][c] = in.nextInt();
            }
        }

        System.out.println("\nA Matriz ficou: \n");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.printf("\t %d \t", matrizz[l][c]);
            }
            System.out.println( );
        }
    }
}
