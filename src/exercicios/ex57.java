package exercicios;

public class ex57 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (ePerfeito(i)) {
                System.out.println(i + " é perfeito");
            }
        }

    }

    public static boolean ePerfeito (int n) {
        int soma = 0;
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma == n;
    }
}
