package exercicios;

public class Methods {
    public static void main(String[] args) {
        msg();
        int a = soma();
        System.out.println(1 + a);
        int b = soma2(5, 9);
        System.out.println("soma: " + b);
        String c = msg2();
        System.out.println(c);

        if (verdade()){
            msg();
        }
        else if (falso()){
            msg();
        }
    }
    public static void msg(){
        System.out.println("ola");
    }
    public static int soma () {
        return 1 + 1;
    }

    public static int soma2 (int a, int b) {
        return a + b;
    }

    public static String msg2(){
        return "ola";
    }

    public static boolean verdade () {
        return true;
    }

    public static boolean falso () {
        return false;
    }
}
