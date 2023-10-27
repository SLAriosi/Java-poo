package selva;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miar");
    }

    @Override
    public void dormir() {
        System.out.println("RrrrRRRrrrr");
    }
}
