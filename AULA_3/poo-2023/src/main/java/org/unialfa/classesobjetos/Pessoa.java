package org.unialfa.classesobjetos;

public class Pessoa{
    private String nome;
    private String cidade;

    public Pessoa(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }
    public void falarNomeECidade(){
        System.out.println(nome + " mora em " + cidade);
    }
}