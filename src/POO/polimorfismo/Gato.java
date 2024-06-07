package POO.polimorfismo;

public class Gato extends Animais{
    public Gato () {
        this.nome = "Gato";
        this.nPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("O " + this.nome + " que tem " + this.nPatas + " patas, faz MIAU");
    }
}
