package exercicios;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int op;

        do {
            System.out.println("\t1. Ver o menu");
            System.out.println("\t2. Ler o menu");
            System.out.println("\t3. Repetir o menu");
            System.out.println("\t4. Tudo de novo");
            System.out.println("\t5. Não li, pode repetir?");
            System.out.println("\t0. Sair");

            System.out.print("Digite sua opçao: ");
            op = input.nextInt();

            if(op == 0){
                cont = false;
                System.out.println("Programa finalizado.");
            }
            else{
                System.out.print("\n\n\n\n\n\n");
            }

        } while (cont);
    }
}