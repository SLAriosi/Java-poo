package mamiferos;

public class Leao extends Carnivoro {
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som de rugido.");
    }
    public static Leao criarLeao(String nome) {
        return new Leao(nome);
    }
}
