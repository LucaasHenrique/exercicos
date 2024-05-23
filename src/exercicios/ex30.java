package exercicios;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, ast, esp;
        System.out.print("Digite um número impar: ");
        num = in.nextInt();

        if (num % 2 != 0){
            ast = 1;
            esp = (num-1)/2;
            for (int l = 1; esp > 0; l++){
                for (int count = 1; count <= esp; count++){
                    System.out.print(" ");
                }

                for (int count = 1; count <= ast; count++){
                    System.out.print("*");
                }

                esp--;
                ast += 2;
                System.out.println();
            }

            for (int l = 1; ast > 0; l++){
                for (int count = 1; count <= esp; count++){
                    System.out.print(" ");
                }

                for (int count = 1; count <= ast; count++){
                    System.out.print("*");
                }

                esp++;
                ast -= 2;
                System.out.println();
            }
        } else{
            System.out.println("Não é ímpar!");
        }
    }
}