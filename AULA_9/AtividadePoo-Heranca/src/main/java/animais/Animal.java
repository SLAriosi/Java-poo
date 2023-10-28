package animais;

public abstract class Animal {
    private String nome;
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
