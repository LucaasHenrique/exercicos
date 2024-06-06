package POO.override;

public class Filha extends Pai {
    private final String nomeFilha;

    public Filha(String nomeFilha, String nomePai){
        super(nomePai);
        this.nomeFilha = nomeFilha;

    }

    @Override
    public void nome () {
        System.out.println("nome da filha é " + this.nomeFilha + "é do pai " + this.nomePai);
    }
}