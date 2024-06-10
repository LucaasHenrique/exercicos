package POO.exemplo;

public class Carneiro extends Animal{
    public Carneiro(){
        this.nome = "Banabé";
        this.numeroPatas = 4;

    }

    @Override
    public void som(){
        System.out.print("BÉÉÉ");
    }
}
