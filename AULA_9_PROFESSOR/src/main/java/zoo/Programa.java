package zoo;

import zoo.aves.Papagaio;
import zoo.aves.Tucano;
import zoo.mamiferos.*;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Atividade Zoo");

        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(construirMamifero(new Hiena(), "risadinha", false));
        mamiferos.add(construirMamifero(new Leao(), "Cimba", true));
        mamiferos.add(construirMamifero(new Elefante(), "Elephante", false));
        mamiferos.add(construirMamifero(new Girafa(), "Girafas", false));
        mamiferos.forEach(Mamifero::alimentar);

        List<Animal> animais = new ArrayList<>();
        animais.add(construirPapagaio());
        animais.add(construirTucano());
        animais.addAll(mamiferos);
        animais.forEach(Animal::emitirSom);



    }

    private static Mamifero construirMamifero(Mamifero mamifero, String nome, Boolean filhote) {
        mamifero.setNome(nome);
        mamifero.setFilhote(filhote);

        return mamifero;
    }


    private static Tucano construirTucano() {
        var tucano = new Tucano();
        tucano.setNome("Tucano Amrelo");
        return tucano;
    }

    private static Papagaio construirPapagaio() {
        var pirata = new Papagaio();
        pirata.setNome("Papagaio Pirata");
        pirata.repetirPalavras("Vai São Paulo");
        return pirata;
    }
}
