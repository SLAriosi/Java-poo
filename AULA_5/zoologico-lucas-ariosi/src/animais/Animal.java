package animais;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String especie;
    private String alimentacao;

    public Animal(String nome, String especie, String alimentacao) {
        this.nome = nome;

        this.especie = especie;

        this.alimentacao = alimentacao;
    }

    public void ListinhadosAnimal() {
        System.out.println("Nome: " + nome);

        System.out.println("Espécie: " + especie);

        System.out.println("Alimentação: " + alimentacao);
    }

    public static Animal CriarAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do animal:");
        String nome = scanner.nextLine();

        System.out.println("Espécie do animal:");
        String especie = scanner.nextLine();

        System.out.println("Alimentação do animal:");
        String alimentacao = scanner.nextLine();

        return new Animal(nome, especie, alimentacao);
    }
}

