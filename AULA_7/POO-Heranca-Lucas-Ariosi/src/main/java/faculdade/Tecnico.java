package faculdade;

import faculdadeheranca.Funcionario;

import java.util.Scanner;

public class Tecnico extends Funcionario {
    private String departamento;
    private String especialidade;

    @Override
    public String toString() {
        return "Técnico{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
    public static Tecnico construir(){
        var tecnico = new Tecnico();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        tecnico.nome = scanner.nextLine();

        System.out.println("Departamento: ");
        tecnico.departamento = scanner.nextLine();

        System.out.println("Especialidade: ");
        tecnico.especialidade = scanner.nextLine();

        return tecnico;
    }
}
