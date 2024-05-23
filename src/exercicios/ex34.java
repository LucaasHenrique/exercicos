package exercicios;
import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, soma = 0;

        System.out.println("Digite um num: ");
        num = in.nextInt();

        if ((num <= 10) && (num > 0)){
            for (int i = num; i <= num + 19; i++){
                soma += i * i;
            }
            System.out.println("soma dos quadrados: " + soma);
        } else {
            System.out.println("numero invalido! ");
        }
    }
}
