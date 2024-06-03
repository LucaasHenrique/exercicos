package POO.caixa;
import java.util.Scanner;

public class Conta {
    Scanner in = new Scanner(System.in);
    private String nome;
    private double saldo;
    private int codeConta, saques;

    public Conta (String nome, int codeConta, double saldo) {
            this.nome = nome;
            this.codeConta = codeConta;
            this.saldo = saldo;
            saques = 0;
    }

    public void menu () {
        System.out.println("Menu: \n" +
                "1 - Extrato: exibe o nome, número da conta, saldo e quantos saques já foram realizados \n" +
                "2 - Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo \n" +
                "3 - Depositar: recebe o valor a ser depositado e mostra o novo saldo \n" +
                "4 - Sair \n");
    }

    public void extrato () {
        System.out.printf("Nome do cliente: %s \n", this.nome);
        System.out.printf("Numero da conta: %d \n", this.codeConta);
        System.out.printf("Saldo em conta: %.2f \n", this.saldo);
        System.out.printf("Numero de saques: %d \n", this.saques);
    }

    public void saque(double v_saque) {
        if (v_saque > 0) {
            this.saldo -= v_saque;
            System.out.printf("Você sacou %.2f, e seu novo saldo é %.2f \n", v_saque, this.saldo);
        } else {
            System.out.println("digite um valor valido!");
        }
    }

    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("voce depositou: " + valor);
            System.out.println("seu novo saldo é: " + this.saldo);
        }
    }

    public void iniciar () {
        int op;

        do {
            menu();
            System.out.println("digite sua opção: ");
            op = in.nextInt();
            opcao(op);
            if (op == 2) {
                this.saques += 1;
            }
        } while (op != 4);
    }

    private void opcao(int op) {
        double valor;

        switch (op) {
            case 1:
                extrato();
                break;
            case 2:
                if (this.saques < 3) {
                    System.out.print("valor de saque: ");
                    valor = in.nextDouble();
                    saque(valor);
                } else {
                    System.out.println("limite de saque atingido!!");
                }
                break;
            case 3:
                System.out.print("valor de deposito: ");
                valor = in.nextDouble();
                depositar(valor);
                break;
            case 4:
                System.out.println("encerrando sitema...");
                System.out.println("ate logo!");
                break;
            default:
                System.out.println("opção invalida!");
        }
    }
}
