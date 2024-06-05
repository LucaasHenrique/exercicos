package POO.funcionario2;

public class Funcionario {
    private double salario;
    private Data data;
    private String nome;
    private String rg;
    private static int id = 0;

    public Funcionario () {

    }
    public Funcionario (String nome, Data data, double salario, String rg) {
        this.nome = nome;
        this.data = data;
        this.salario = salario;
        this.rg = rg;
        id++;
    }

    public void bonifica (double aumento) {
        salario *= (aumento / 100) + 1;
        System.out.println("Salario com bonificação: " + salario);
    }

    public double ganhoAnual () {
        return this.salario * 12;
    }

    public double getSalario () {
        return this.salario;
    }

    public String getNome () {
        return this.nome;
    }

    public String getRg () {
        return this.rg;
    }

    public Data getData () {
        return this.data;
    }

    public void mostra () {
        System.out.println("nome: " + this.nome);
        System.out.println("rg: " + this.rg);
        System.out.println("salario: " + this.salario);
        System.out.println("ganho: " + this.ganhoAnual());
        this.Datas();
    }

    public void Datas () {
        System.out.println("dia: " + this.data.getDia());
        System.out.println("mes: " + this.data.getMes());
        System.out.println("ano: " + this.data.getAno());
    }
}
