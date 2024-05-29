package exercicios;
import java.util.Random;

public class ex51 {
    public static void main(String[] args) {
        int a, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;
        float prob;
        for (int i = 0; i <= 1000000; i++) {
            a = dado();

            switch (a){
                case 1:
                    c1 += 1;
                    break;
                case 2:
                    c2 += 1;
                    break;
                case 3:
                    c3 += 1;
                    break;
                case 4:
                    c4 += 1;
                    break;
                case 5:
                    c5 += 1;
                    break;
                case 6:
                    c6 += 1;
                    break;
            }
        }
        System.out.println("1 apareceu: " + c1 + " | porcentagem: " + (float) (c1 * 100) / 1000000 + "%");
        System.out.println("2 apareceu: " + c2 + " | porcentagem: " + (float) (c2 * 100) / 1000000 + "%");
        System.out.println("3 apareceu: " + c3 + " | porcentagem: " + (float) (c3 * 100) / 1000000 + "%");
        System.out.println("4 apareceu: " + c4 + " | porcentagem: " + (float) (c4 * 100) / 1000000 + "%");
        System.out.println("5 apareceu: " + c5 + " | porcentagem: " + (float) (c5 * 100) / 1000000 + "%");
        System.out.println("6 apareceu: " + c6 + " | porcentagem: " + (float) (c6 * 100) / 1000000 + "%");
    }

    public static int dado() {
        Random rand = new Random();

        return rand.nextInt(6) + 1;
    }
}
