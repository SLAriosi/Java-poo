package Animais;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
