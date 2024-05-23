package exercicios;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma=0, notas, media;
        System.out.print("total: ");
        int total = input.nextInt();

        for (int i = 1; i <= total; i++){
            System.out.print("notas: ");
            notas = input.nextInt();
            soma += notas;
        }
        media = soma / total;
        System.out.println("media: " + media);
    }
}