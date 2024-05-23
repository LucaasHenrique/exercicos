package exercicios;

import java.util.Scanner;

/*public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        char op;

        System.out.print("operação [+ - * /]: ");
        op = input.nextLine().charAt(0);

        System.out.print("primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("segundo número: ");
        numero2 = input.nextInt();
        System.out.println();

        switch (op){
            case '+':
                System.out.printf("%d + %d = %d", numero1, numero2, numero1 + numero2);
                break;
            case '-':
                System.out.printf("%d - %d = %d", numero1, numero2, numero1 - numero2);
                break;
            case '*':
                System.out.printf("%d * %d = %d", numero1, numero2, numero1 * numero2);
                break;
            case '/':
                System.out.printf("%d / %d = %d", numero1, numero2, numero1 / numero2);
                break;
            default:
                System.out.println("opção invalida!!");
        }
    }
}*/

/*public class Switch {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma vogal minúscula: ");
        vogal = entrada.nextLine().charAt(0);

        switch( vogal )
        {
            case 'a':
                System.out.println("Você está no case da vogal 'a'");
            case 'e':
                System.out.println("Você está no case da vogal 'e'");
            case 'i':
                System.out.println("Você está no case da vogal 'i'");
            case 'o':
                System.out.println("Você está no case da vogal 'o'");
            case 'u':
                System.out.println("Você está no case da vogal 'u'");
            default:
                System.out.println("Você não digitou uma vogal minúscula");
        }
    }
}*/

public class Switch {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma vogal: ");
        vogal = entrada.nextLine().charAt(0);

        switch( vogal )
        {
            case 'a': case 'A':
            System.out.println("Você digitou 'a' ou 'A' ");
            break;

            case 'e': case 'E':
            System.out.println("Você digitou 'e' ou 'E' ");
            break;

            case 'i': case 'I':
            System.out.println("Você digitou 'i' ou 'I' ");
            break;

            case 'o': case 'O':
            System.out.println("Você digitou 'o' ou 'O' ");
            break;

            case 'u': case 'U':
            System.out.println("Você digitou 'u' ou 'U' ");
            break;

            default:
                System.out.println("Você não digitou uma vogal !");
        }
    }
}
