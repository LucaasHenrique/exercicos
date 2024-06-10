package POO.exemplo;

public class Vaca extends Animal{
    public Vaca () {
        this.nome = "mimosa";
        this.numeroPatas = 4;
    }

    @Override
    public void som() {
        System.out.println("Muu");
    }
}
