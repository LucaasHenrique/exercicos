package POO.mercado;

public class Produtos {
    private double preco;
    public Produtos (double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("preco invalido! ");
        }
    }

    public void preco (HorarioCompra hora) {
        if (hora.getHoras() >= 20 && hora.getHoras() < 24) {
            this.preco *= 0.9;
        } else {
            if (hora.getDia().equals("Sabado") || hora.getDia().equals("domingo")) {
                this.preco *= 0.9;
            }
        }
    }

    public double getPreco () {
        return this.preco;
    }
}
