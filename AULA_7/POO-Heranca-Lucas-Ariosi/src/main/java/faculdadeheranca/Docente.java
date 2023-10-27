package faculdadeheranca;

import java.util.Scanner;

public class Docente {

    private String nome;
    private String formacao;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + getNome() + '\'' +
                ", formacao='" + getFormacao() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                '}';
    }

    public void imprimir(){
        System.out.println(this);
    }

    public static Docente construir(){
        var docente = new Docente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        docente.setNome(scanner.nextLine());

        System.out.println("Formação: ");
        docente.setFormacao(scanner.nextLine());

        System.out.println("Cidade: ");
        docente.setCidade(scanner.nextLine());

        return docente;
    }
}
