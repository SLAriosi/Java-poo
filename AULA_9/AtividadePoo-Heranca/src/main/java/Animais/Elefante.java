package Animais;

public class Elefante extends Mamifero {
    public Elefante(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "faz um som de trombeta.");
    }

    public static Elefante criarElefante(String nome) {
        return new Elefante(nome);
    }
}