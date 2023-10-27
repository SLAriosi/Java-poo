package org.unialfa.algoritomos;

import java.util.Scanner;

public class AtividadeTriangulo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        float[][] triangulo = new float[3][2];
        float resultado;
        int linha;

        Scanner scanner = new Scanner(System.in);

        for (linha = 0; linha < 3; linha++) {

            System.out.println("Informe os dados do triangulo "+ (linha + 1));

            System.out.println("Base:");
            triangulo[linha][0] = scanner.nextFloat();

            System.out.println("Altura:");
            triangulo[linha][1] = scanner.nextFloat();
        }

        for (linha = 0; linha < 3; linha++) {
            resultado = (triangulo[linha][0] * triangulo[linha][1]) / 2;
            System.out.println("Triangulo " + (linha + 1) + " área " + resultado);
        }
        scanner.close();
    }
}