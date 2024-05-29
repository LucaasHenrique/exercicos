package exercicios;
import java.util.Random;
import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chance = 7, tent, num_sort;

        num_sort = num_rand();

        do {
            System.out.println("sua tentativa: ");
            tent = in.nextInt();

            jogo(tent, num_sort);
            chance -= 1;

            if (chance == 0) {
                System.out.println("suas tentativas acabaram!!");
            }

        } while (tent != num_sort && chance != 0);
    }

    public static int num_rand() {
        Random rand = new Random();

        return rand.nextInt(1000) + 1;
    }

    public static void jogo (int tent, int num_sort) {
        if (tent > num_sort) {
            System.out.println("digite numero menor");
        } else {
            if (tent < num_sort){
                System.out.println("digite um numero maior");
            } else {
                System.out.println("voce acertou!");
            }
        }
    }
}
