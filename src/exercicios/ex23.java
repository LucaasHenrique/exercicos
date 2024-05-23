package exercicios;

public class ex23 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        do {
            soma += i;
            i++;
        } while (i <= 15);
        System.out.println("soma: " + soma);
    }
}