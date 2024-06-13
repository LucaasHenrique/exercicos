package array.ex;

public class Funcionario {
    double salario;
    int numero;

    public double getSalario () {
        return this.salario;
    }

    public void mostra() {
        System.out.println("Empregado de numero " + this.numero + ": R$ " + this.getSalario());
    }
}
