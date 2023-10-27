package faculdadeheranca;

import java.util.Scanner;

public class Coordenador {

    private String nome;
    private String curso;
    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + getNome() + '\'' +
                ", curso='" + getCurso() + '\'' +
                ", turma='" + getTurma() + '\'' +
                '}';
    }

    public void imprimir(){
        System.out.println(this);
    }

    public static Coordenador construir(){
        var coordenador = new Coordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        coordenador.setNome(scanner.nextLine());

        System.out.println("Curso: ");
        coordenador.setNome(scanner.nextLine());

        System.out.println("Turma: ");
        coordenador.setNome(scanner.nextLine());

        return coordenador;
    }
}
