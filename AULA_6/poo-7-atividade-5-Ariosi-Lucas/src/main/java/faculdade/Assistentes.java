package faculdade;

import java.util.Scanner;

public class Assistentes {
    private String nome;
    private String setor;
    private String atribuicao;

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", atribuição='" + atribuicao + '\'' +
                '}';
    }

    public void imprimirDados(){
        System.out.println(this);
    }

    public static Assistentes criar(){
        var objetoAssistente = new Assistentes();
        var scanner =  new Scanner(System.in);

        System.out.println("Nome:");
        objetoAssistente.nome = scanner.nextLine();

        System.out.println("Setor:");
        objetoAssistente.setor = scanner.nextLine();

        System.out.println("Atribuição:");
        objetoAssistente.atribuicao = scanner.nextLine();

        System.out.println(objetoAssistente.nome + " cadastrado!");
        return objetoAssistente;
    }
}