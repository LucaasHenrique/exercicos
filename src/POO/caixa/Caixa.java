package POO.caixa;
import java.util.Scanner;
import java.util.Random;

public class Caixa {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        String nome;
        double saldo;
        int codeConta = 1 + rand.nextInt(9999);

        System.out.print("digite seu nome: ");
        nome = in.nextLine();

        System.out.print("saldo inicial: ");
        saldo = in.nextDouble();

        Conta c1 = new Conta(nome, codeConta, saldo);
        c1.iniciar();
    }
}
