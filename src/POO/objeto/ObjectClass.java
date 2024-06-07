package POO.objeto;

public class ObjectClass {
    public static void main(String[] args) {
        ClasseTeste1 classe1 = new ClasseTeste1();
        ClasseTeste2 classe2 = new ClasseTeste2();

        System.out.println("\ngetClass() da classeTeste: " + classe1.getClass());
        System.out.println("getClass() da classeTeste2: " + classe2.getClass());

//        Object classe3 = classe2.clone();
        ClasseTeste2 classe3 = (ClasseTeste2) classe2.clone();
        System.out.println("\nObjeto classe3 é clone ao classe2? "+classe3.equals(classe2));

        System.out.println("\ntoString da classe1: "+classe1.toString());
        System.out.println("toString da classe2: "+classe2.toString());


        System.out.println("\nObjeto classe1 é igual classe2 ? " + classe2.equals(classe1));
        System.out.println("Objeto classe1 é igual classe1 ? " + classe1.equals(classe1));
        System.out.println("Objeto classe2 é igual classe3 ? " + classe2.equals(classe3));

        System.out.println("\nHash code da classe 1: "+classe1.hashCode());
        System.out.println("Hash code da classe 2: "+classe2.hashCode());
        System.out.println("Hash code da classe 3: "+classe3.hashCode());
    }
}
