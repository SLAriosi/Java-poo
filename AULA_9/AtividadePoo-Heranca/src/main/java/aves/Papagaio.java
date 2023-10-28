package aves;

public class Papagaio extends Ave {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som de papagaio.");
    }
    public static Papagaio criarPapagaio(String nome) {
        return new Papagaio(nome);
    }
}