package org.unialfa.atividadetriangulo;

import java.util.Scanner;

public class Triangulo {
    private String nome;
    private float base;
    private float altura;

    public void imprimirResultado(){
        float resultado = (base + altura) / 2;
        System.out.println("Triângulo " + nome + " área " + resultado);
    }
    public static Triangulo criar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do Triângulo");
        Triangulo objeto = new Triangulo();

        System.out.println("Nome: ");
        objeto.nome = scanner.nextLine();

        System.out.println("Altura: ");
        objeto.altura = scanner.nextFloat();

        System.out.println("Base: ");
        objeto.base = scanner.nextFloat();

        return objeto;
    }
}
