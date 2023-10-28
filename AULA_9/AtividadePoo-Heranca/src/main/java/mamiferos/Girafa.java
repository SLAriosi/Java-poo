package mamiferos;

public class Girafa extends Mamifero {
    public Girafa(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " Faz som como um poste.");
    }
    public static Girafa criarGirafa(String nome) {
        return new Girafa(nome);
    }
}