package POO.objeto;

public class ClasseTeste1 extends Object {
    public String s1;

    public ClasseTeste1(){
        System.out.println("Objeto da classeTeste criado!");
        this.s1= "oi";

    }

    @Override
    protected Object clone(){
        return this;
    }
}
