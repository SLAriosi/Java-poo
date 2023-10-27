package faculdade;

import faculdadeheranca.Funcionario;

import java.util.Scanner;

public class Docente extends Funcionario {
    private String formacao;
    private String cidade;

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", formacao='" + formacao + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public static Docente construir(){
        var docente = new Docente();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        docente.nome = scanner.nextLine();

        System.out.println("Formação: ");
        docente.formacao = scanner.nextLine();

        System.out.println("Cidade: ");
        docente.cidade = scanner.nextLine();

        return docente;
    }
}
