package Animais;
public class Girafa extends Mamifero {
    public Girafa(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som de mugido.");
    }
    public static Girafa criarGirafa(String nome) {
        return new Girafa(nome);
    }
}