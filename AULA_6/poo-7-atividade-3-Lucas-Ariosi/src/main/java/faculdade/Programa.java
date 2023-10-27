package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Assistentes");
        cadastrarAssistentes();
    }

    private static void cadastrarAssistentes(){
        List<Assistentes> assistentes = new ArrayList<>();

        for (int i = 0; i < 3; i++) assistentes.add(Assistentes.criar());

        var scanner = new Scanner(System.in);
        do {
            assistentes.add(Assistentes.criar());
            System.out.println("Deseja continuar? [s]");
        } while (scanner.nextLine().equals("s"));

        assistentes.forEach(Assistentes::imprimirDados);
    }
}