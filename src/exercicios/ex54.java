package exercicios;

public class ex54 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse (int num) {
        String str1 = Integer.toString(num);
        String str2 = "";
        int c = str1.length(), numReverse;
        while (c != 0) {
            c -= 1;
            str2 = str2 + str1.charAt(c);
        }
        numReverse = Integer.parseInt(str2);
        return numReverse;
    }
}
