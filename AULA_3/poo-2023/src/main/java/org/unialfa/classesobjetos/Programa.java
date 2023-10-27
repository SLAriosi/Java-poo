package org.unialfa.classesobjetos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Lucas","Umuarama-PR"));

        pessoas.get(0).falarNomeECidade();
    }
}
