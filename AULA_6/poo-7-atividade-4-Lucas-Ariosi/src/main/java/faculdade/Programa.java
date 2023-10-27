package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Coordenadores");
        cadastrarCoordenadores();
    }

    private static void cadastrarCoordenadores(){
        List<Coordenador> coordenadores = new ArrayList<>();

        for (int i = 0; i < 3; i++) coordenadores.add(Coordenador.criar());

        var scanner = new Scanner(System.in);
        do {
            coordenadores.add(Coordenador.criar());
            System.out.println("Deseja continuar? [s]");
        } while (scanner.nextLine().equals("s"));

        coordenadores.forEach(Coordenador::imprimirDados);
    }
}
