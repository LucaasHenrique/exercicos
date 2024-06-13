package array.ex;

public class Main {
    public static void main(String[] args) {
        Empresa nikes = new Empresa("nike", "93234323");

        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            f.numero = i + 1;
            nikes.adiciona(f);
        }

        nikes.mostraEmpregados();

        Funcionario f7 = new Funcionario();
        f7.numero = 7;
        Funcionario f20 = new Funcionario();
        f20.numero = 20;

        System.out.println("Funcionario f7: " + nikes.contem(f7));
        System.out.println("Funcionario f20: " + nikes.contem(f20));
    }
}
