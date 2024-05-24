package exercicios;
import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, num_quadrado;
        System.out.print("digite um numero: ");
        num = in.nextInt();

        num_quadrado = quadrado(num);
        System.out.printf("quadrado de %d é %d", num, num_quadrado);

    }
    public static int quadrado(int num) {
        return num * num;
    }
}
