package faculdade;

import java.util.Scanner;

public class Tecnicos    {
    private String nome;
    private String departamento;
    private String especialidade;

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    public void imprimirDados(){
        System.out.println(this);
    }

    public static Tecnicos criar(){
        var objetoTecnico= new Tecnicos();
        var scanner =  new Scanner(System.in);

        System.out.println("Nome:");
        objetoTecnico.nome = scanner.nextLine();

        System.out.println("Departamento:");
        objetoTecnico.departamento = scanner.nextLine();

        System.out.println("Especialidade:");
        objetoTecnico.especialidade = scanner.nextLine();

        System.out.println(objetoTecnico.nome + " cadastrado!");
        return objetoTecnico;
    }
}