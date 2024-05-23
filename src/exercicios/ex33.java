package exercicios;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero: ");

        n = in.nextInt();

        System.out.println("tabuada: ");
        for (int i = 10; i >= 1; i--){
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }
}
