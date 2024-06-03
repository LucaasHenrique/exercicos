package POO.funcionario;

public class Funcionario {
    private String nome;
    private int ID;
    private double salario;

    public Funcionario (String nome, int ID, double salario) {
        setNome(nome);
        setId(ID);
        setSalario(salario);
        this.print();
    }

    public void print () {
        System.out.printf("funcionario(a) %s, tem ID %d é recebe %.0f por mes \n", this.nome, this.ID, this.salario);
    }

    // usar metodo set apenas quando for fazer algo além de fornecer valor, ex: public void setSalario (double salario) {
    //        this.salario = salario - descontos;
    //    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setId (int ID) {
        this.ID = ID;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }

    public String getNome () {
        return this.nome;
    }

    public int getID () {
        return this.ID;
    }

    public double getSalario () {
        return this.salario;
    }
}
