package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Tecnicos");
        cadastrarTecnicos();
    }

    private static void cadastrarTecnicos(){
        List<Tecnicos> tecnicos = new ArrayList<>();

        for (int i = 0; i < 3; i++) tecnicos.add(Tecnicos.criar());

        var scanner = new Scanner(System.in);
        do {
            tecnicos.add(Tecnicos.criar());
            System.out.println("Deseja continuar? [s]");
        } while (scanner.nextLine().equals("s"));

        tecnicos.forEach(Tecnicos::imprimirDados);
    }
}
