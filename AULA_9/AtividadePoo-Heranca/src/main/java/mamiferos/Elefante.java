package mamiferos;

public class Elefante extends Mamifero {
    public Elefante(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz som de trompete desafinado.");
    }

    public static Elefante criarElefante(String nome) {
        return new Elefante(nome);
    }
}