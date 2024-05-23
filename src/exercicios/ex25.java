package exercicios;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes, dias = 31;

        System.out.print("digite o mes: ");
        mes = input.nextInt();

        if(mes>12 || mes<1){
            System.out.println("Mês inválido");
            return;
        }

        switch (mes){
            case 2:
                dias -= 2;
            case 4: case 6: case 9: case 11:
                dias--;
        }
        System.out.printf("o mes %d possui %d dias", mes, dias);
    }
}