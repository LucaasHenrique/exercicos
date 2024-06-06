package POO.Cartao;

public class Cartao {

    private double limite, fatura = 0;

    public Cartao (double limite) {
        this.limite = limite;
    }

    public void aumentaLimite (double valor) {
        this.limite += valor;
    }

    public void diminuiLimite (double valor) {
        this.limite -= valor;
    }

    public void realizaCompra (double valor) {
        if (this.limite > 0) {
            this.fatura += valor;
            diminuiLimite(valor);
        } else {
            System.out.println("limite atingido! ");
        }
    }

    public void imprimeFatura () {
        System.out.println("sua fatura: " + this.fatura);
    }

    public double getLimite (){
        return this.limite;
    }
}
