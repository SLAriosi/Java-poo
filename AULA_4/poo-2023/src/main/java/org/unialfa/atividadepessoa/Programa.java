package org.unialfa.atividadepessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Pessoa> lista = Arrays.asList(Pessoa.criar(), Pessoa.criar(), Pessoa.criar(), Pessoa.criar());
        lista.forEach(Pessoa :: escreverNomeECidade);
    }
}

