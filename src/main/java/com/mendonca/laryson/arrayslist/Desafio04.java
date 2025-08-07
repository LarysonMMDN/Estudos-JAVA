package com.mendonca.laryson.arrayslist;

import java.util.ArrayList;
import java.util.Scanner;

/* Desafio 04: Buscando um elemento na lista
 * Descrição: Permita que o usuário informe um nome,
 * e verifique se ele existe no ArrayList. Mostre a
 * posição do nome, caso exista.
 * Nível: Intermediário
 */

public class Desafio04 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        listaNomes.add("Ana");
        listaNomes.add("Bruno");
        listaNomes.add("Carla");
        listaNomes.add("Diego");
        listaNomes.add("Eduarda");
        listaNomes.add("Felipe");
        listaNomes.add("Giovana");
        listaNomes.add("Henrique");
        listaNomes.add("Isabela");
        listaNomes.add("João");

        System.out.println("Digite um nome para verificar se ele está na lista.");
        System.out.print(">> ");
        String nome = scanner.next();

        if (listaNomes.contains(nome))
            System.out.print("O nome " + nome + " está na lista na posição ");
            for (int i = 0; i < listaNomes.size(); i++) {
                if (listaNomes.get(i).equals(nome))
                    System.out.println(i);
            }

    }
}
