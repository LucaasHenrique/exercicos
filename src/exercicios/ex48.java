package exercicios;

public class ex48 {
    public static void main(String[] args) {
        System.out.println("delta: " + delta(1, 5, 7) );
    }

    public static int delta (int a, int b, int c) {
        return (b * b) - 4*a*c;
    }
}
