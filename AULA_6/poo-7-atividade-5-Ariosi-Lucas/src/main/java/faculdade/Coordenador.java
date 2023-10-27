package faculdade;

import java.util.Scanner;

public class Coordenador {
    private String nome;
    private String curso;
    private String turno;

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }

    public void imprimirDados(){
        System.out.println(this);
    }

    public static Coordenador criar(){
        var objetoCoordenador = new Coordenador();
        var scanner =  new Scanner(System.in);

        System.out.println("Nome:");
        objetoCoordenador.nome = scanner.nextLine();

        System.out.println("Curso:");
        objetoCoordenador.curso = scanner.nextLine();

        System.out.println("Turno:");
        objetoCoordenador.turno = scanner.nextLine();

        System.out.println(objetoCoordenador.nome + " cadastrado!");
        return objetoCoordenador;
    }
}