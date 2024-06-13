package array;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("nome %d: ", i + 1);
            nomes[i] = in.nextLine();
        }

        for (String nome: nomes) {
            System.out.println("nome" + nome);
        }
    }
}
