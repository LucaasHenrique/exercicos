package array.array;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "luka";
        float[] notas = new float[3];

        System.out.print("nota 1: ");
        notas[0] = in.nextFloat();
        System.out.print("nota 2: ");
        notas[1] = in.nextFloat();

        // media
        notas[2] = (notas[0] + notas[1]) / 2;

        System.out.printf("O aluno %s tirou %.1f e %.1f, obtendo média final %.2f", nome, notas[0], notas[1], notas[2]);
    }
}
