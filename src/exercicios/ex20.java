package exercicios;

import java.util.concurrent.ThreadLocalRandom;

public class ex20 {
    public static void main(String[] args) {
        int num_random;
        for (int i = 1; i <= 20; i++){
            num_random = ThreadLocalRandom.current().nextInt(1000, 1999);
            if (num_random % 11 == 5){
                System.out.println(num_random);
            }
        }
    }
}
