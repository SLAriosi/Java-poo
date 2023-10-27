package Animais;

public class Hiena extends Carnivoro {
    public Hiena(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som de risada.");
    }
    public static Hiena criarHiena(String nome) {
        return new Hiena(nome);
    }
}
