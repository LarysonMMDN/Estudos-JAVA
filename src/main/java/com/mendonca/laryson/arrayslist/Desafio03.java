package com.mendonca.laryson.arrayslist;

/* Desafio 03: Ordenando uma lista de nomes
 * Descrição: Crie um ArrayList com nomes de pessoas e
 * ordene-os em ordem alfabética. Mostre a lista antes e
 * depois da ordenação.
 * Nível: Iniciante
 */

import java.util.ArrayList;
import java.util.Collections;

public class Desafio03 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Isabela");
        listaNomes.add("Diego");
        listaNomes.add("Ana");
        listaNomes.add("Bruno");
        listaNomes.add("Eduarda");
        listaNomes.add("Felipe");
        listaNomes.add("Carla");
        listaNomes.add("Henrique");
        listaNomes.add("João");
        listaNomes.add("Giovana");

        System.out.println("----- Lista antes da ordenação -----");
        for (int i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }

        System.out.println("----- Lista depois da ordenação -----");
        Collections.sort(listaNomes);
        for (int i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }



    }
}
