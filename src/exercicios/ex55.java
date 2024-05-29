package exercicios;

public class ex55 {
    public static void main(String[] args) {
        System.out.println("mdc: " + mdc(50, 20));
    }
    public static int mdc (int a, int b) {
        int r;
        while (b != 0) {
            r = b;
            b = a % b;
            a = r;
        }
        return a;
    }
}
