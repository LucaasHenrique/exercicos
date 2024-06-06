package POO.heranca;

public class Filha extends Pai {
    private String nomeFilha;

    public Filha (String nome) {
        this.nomeFilha = nome;
        System.out.println("O nome da filha é '" + this.nomeFilha +
                "' e o do pai é '" + getNome() + "'.");
    }
}
