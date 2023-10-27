package org.unialfa.atividadepessoa;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cidade;



    public void escreverNomeECidade(){
        System.out.println(nome + " mora em " + cidade);
    }





    public static Pessoa criar(){
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome");
        pessoa.nome = scanner.nextLine();

        System.out.println("Digite a cidade");
        pessoa.cidade = scanner.nextLine();

        return pessoa;
    }
}
