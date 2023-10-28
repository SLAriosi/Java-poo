package animais;

import aves.Papagaio;
import aves.Tucano;
import mamiferos.Elefante;
import mamiferos.Girafa;
import mamiferos.Hiena;
import mamiferos.Leao;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        animais.add(new Elefante("Dumbo"));
        animais.add(new Leao("Simba"));
        animais.add(new Papagaio("Louro José"));

        while (true) {
            System.out.println("Escolha o tipo de animal para adicionar:");
            System.out.println("1. Elefante");
            System.out.println("2. Girafa");
            System.out.println("3. Leão");
            System.out.println("4. Hiena");
            System.out.println("5. Papagaio");
            System.out.println("6. Tucano");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();
            if (escolha == 0) {
                break;
            }

            System.out.print("Digite o nome do animal: ");
            String nome = scanner.next();

            Animal animal = null;

            switch (escolha) {
                case 1:
                    animal = Elefante.criarElefante(nome);
                    break;
                case 2:
                    animal = Girafa.criarGirafa(nome);
                    break;
                case 3:
                    animal = Leao.criarLeao(nome);
                    break;
                case 4:
                    animal = Hiena.criarHiena(nome);
                    break;
                case 5:
                    animal = Papagaio.criarPapagaio(nome);
                    break;
                case 6:
                    animal = Tucano.criarTucano(nome);
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            if (animal != null) {
                animais.add(animal);
                System.out.println("Animal adicionado: " + animal);
            }
        }

        System.out.println("Animais Adicionados:");
        for (Animal animal : animais) {
            System.out.println(animal);
            animal.emitirSom();
            System.out.println();
        }
    }
}