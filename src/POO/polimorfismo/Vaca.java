package POO.polimorfismo;

public class Vaca extends Animais{
    public Vaca () {
        this.nome = "vaca";
        this.nPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("A " + this.nome + " que tem " + this.nPatas + " patas, faz MUUUU");
    }
}
