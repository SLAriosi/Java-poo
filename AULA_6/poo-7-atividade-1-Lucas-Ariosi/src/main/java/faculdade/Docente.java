package faculdade;

import java.util.Scanner;

public class Docente {
    private String nome;
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

    public void imprimirDados(){
        System.out.println(this);
    }

    public static Docente criar(){
        var objetoDocente = new Docente();
        var scanner =  new Scanner(System.in);

        System.out.println("Nome:");
        objetoDocente.nome = scanner.nextLine();

        System.out.println("Formação:");
        objetoDocente.formacao = scanner.nextLine();

        System.out.println("Cidade:");
        objetoDocente.cidade = scanner.nextLine();

        System.out.println(objetoDocente.nome + " cadastrado!");
        return objetoDocente;
    }
}