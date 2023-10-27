package org.unialfa.algoritmos;

import java.util.Scanner;

public class NumeroFinder {

    private int[] numeros;
    private int maior;

    public NumeroFinder(int tamanho) {
        numeros = new int[tamanho];
        maior = 0;
    }

    public void lerNumeros() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.println("Informe um número:");
                numeros[i] = scanner.nextInt();
            } while (numeros[i] < 0);

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        scanner.close();
    }

    public void encontrarMaiorNumero() {
        System.out.println("Maior número: " + maior);
    }

    public static void main(String[] args) {
        NumeroFinder numeroFinder = new NumeroFinder(5);
        numeroFinder.lerNumeros();
        numeroFinder.encontrarMaiorNumero();
    }
}
