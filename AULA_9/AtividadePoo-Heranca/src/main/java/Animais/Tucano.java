package Animais;

public class Tucano extends Ave {
    public Tucano(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som de tucano.");
    }
    public static Tucano criarTucano(String nome) {
        return new Tucano(nome);
    }
}
