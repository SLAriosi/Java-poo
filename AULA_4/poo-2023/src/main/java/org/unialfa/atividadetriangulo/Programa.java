package org.unialfa.atividadetriangulo;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Triangulo> trianguloList = Arrays.asList(
                Triangulo.criar(),
                Triangulo.criar(),
                Triangulo.criar());
        trianguloList.forEach(Triangulo::imprimirResultado);
    }
}
