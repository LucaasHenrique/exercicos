package exercicios;

public class ex6 {
    public static void main(String[] args) {
        int c = 0;
        while (c != 100) {
            if (c % 2 == 0) {
                System.out.println("pares: " + c);
            }
            c++;
        }
    }
}