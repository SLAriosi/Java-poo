package org.unialfa.atividadetriangulo;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Triangulo {
    private String nome;
    private float base;
    private float altura;

    public void imprimirResultado(){
        float resultado = (base * altura) / 2;
        System.out.println("Triangulo" + nome + " area" + resultado);
    }
    public static Triangulo criar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do triãngulo");
        Triangulo objeto = new Triangulo();

        System.out.println("nome:");
        objeto.nome = scanner.nextLine();

        System.out.println("altura:");
        objeto.altura = scanner.nextFloat();

        System.out.println("base:");
        objeto.base = scanner.nextFloat();

        return objeto;
    }
}

