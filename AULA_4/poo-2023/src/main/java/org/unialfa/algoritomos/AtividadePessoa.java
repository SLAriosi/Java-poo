package org.unialfa.algoritomos;

import java.util.Scanner;

public class AtividadePessoa {
    public static void main(String[] args) {
        String[][] pessoa = new String[4][2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Digite o Nome");
            pessoa[i][0] = scanner.nextLine();

            System.out.println("Digite a Cidade");
            pessoa[i][1] = scanner.nextLine();
        }

        for (int i = 0; i < 4; i++){
            System.out.println(pessoa[i][0] + " mora em " + pessoa[i][1]);
        }

        scanner.close();
    }
}
