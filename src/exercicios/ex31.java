package exercicios;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1, n2;
        int op;

        System.out.print("digite n1: ");
        n1 = in.nextInt();
        System.out.print("digite n2: ");
        n2 = in.nextInt();

        System.out.println("Opçoes: \n" +
                "1 -  Verificar se um dos números lidos é ou não múltiplo do outro \n" +
                "2 – Verificar se os dois números lidos são pares \n" +
                "3 – Verificar se a média dos dois números é maior ou igual a 7 \n" +
                "4 – Sair \n");

        System.out.print("Sua opção: ");
        op = in.nextInt();

        switch (op){
            case 1:
                if ((n1 % n2 == 0)){
                    System.out.println("são multiplos!");
                } else {
                    System.out.println("não são multiplos!");
                }
                break;
            case 2:
                if ((n1 % 2 == 0) && (n2 % 2 == 0)){
                    System.out.println("numeros pares! ");
                } else {
                    System.out.println("pelo menus não é par!");
                }
                break;
            case 3:
                int media;
                media = (n1+n2)/2;
                if (media >= 7){
                    System.out.println("media dos numeros maior que 7");
                } else {
                    System.out.println("não é maior que 7");
                }
                break;
            case 4:
                System.out.println("Até mais!!");
                break;
        }
    }
}
