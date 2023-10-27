package funcionarios;

import java.util.Scanner;
public class Funcionarios {
    private String nome;
    private String funcao;
    private String setor;

    public Funcionarios(String nome, String funcao, String setor) {
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
}

    public void ListaDosFuncionarios() {
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Setor: " + setor);
    }

    public static Funcionarios CriandoOsMenino() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Função do funcionário:");
        String funcao = scanner.nextLine();
        System.out.println("Setor do funcionário:");
        String setor = scanner.nextLine();
        return new Funcionarios(nome, funcao, setor);
    }
}

