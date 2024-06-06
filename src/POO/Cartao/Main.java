package POO.Cartao;

public class Main {
    public static void main(String[] args) {
        Cartao card = new Cartao(1500);
        card.diminuiLimite(500);
        card.aumentaLimite(500);
        card.realizaCompra(500);
        card.imprimeFatura();
        System.out.println("limite: " + card.getLimite());
    }
}