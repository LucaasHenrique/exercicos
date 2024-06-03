package POO.mercado;

public class Main {
    public static void main(String[] args) {
        HorarioCompra hora = new HorarioCompra("segunda", 21, 30, 0);
        Produtos prod = new Produtos(16.5);
        prod.preco(hora);

        System.out.println("preço: " + prod.getPreco());
    }
}
