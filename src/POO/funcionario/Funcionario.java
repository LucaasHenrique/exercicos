package POO.funcionario;

public class Funcionario {
    private String nome;
    private int ID;
    private double salario;

    public Funcionario (String nome, int ID, double salario) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
        this.print();
    }

    public void print () {
        System.out.printf("funcionario(a) %s, tem ID %d é recebe %.0f por mes", this.nome, this.ID, this.salario);
    }
}
