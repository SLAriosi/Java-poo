package faculdadeheranca;

import java.util.Scanner;

public class Tecnico {

    private String nome;
    private String departamento;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Técnico{" +
                "nome='" + getNome() + '\'' +
                ", departamento='" + getDepartamento() + '\'' +
                ", especialidade='" + getEspecialidade() + '\'' +
                '}';
    }

    public void imprimir(){
        System.out.println(this);
    }

    public static Tecnico construir(){
        var tecnico = new Tecnico();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        tecnico.setNome(scanner.nextLine());

        System.out.println("Departamento: ");
        tecnico.setDepartamento(scanner.nextLine());

        System.out.println("Especialidade: ");
        tecnico.setEspecialidade(scanner.nextLine());

        return tecnico;
    }
}
