package faculdade;

import faculdadeheranca.Funcionario;

import java.util.Scanner;

public class Coordenador extends Funcionario {
    private String curso;
    private String turma;


    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }
    public static Coordenador construir(){
        var coordenador = new Coordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        coordenador.nome = scanner.nextLine();

        System.out.println("Curso: ");
        coordenador.curso = scanner.nextLine();

        System.out.println("Turma: ");
        coordenador.turma = scanner.nextLine();

        return coordenador;
    }
}
