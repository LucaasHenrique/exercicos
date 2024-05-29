package exercicios;

public class ex56 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (ePrimo(i)) {
                System.out.println(i + " é primo");
            }
        }
    }

    public static boolean ePrimo (int n) {
        int c = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (n % i == 0) {
                c += 1;
            }
        }
        return c == 2;
    }
}
