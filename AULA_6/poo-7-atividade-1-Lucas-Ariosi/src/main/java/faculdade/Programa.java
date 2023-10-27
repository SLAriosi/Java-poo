package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Docentes");
        cadastrarDocentes();
    }

    private static void cadastrarDocentes(){
        List<Docente> docentes = new ArrayList<>();

        for (int i = 0; i < 3; i++) docentes.add(Docente.criar());

        var scanner = new Scanner(System.in);
        do {
            docentes.add(Docente.criar());
            System.out.println("Deseja continuar? [s]");
        } while (scanner.nextLine().equals("s"));

        docentes.forEach(Docente::imprimirDados);
    }
}
