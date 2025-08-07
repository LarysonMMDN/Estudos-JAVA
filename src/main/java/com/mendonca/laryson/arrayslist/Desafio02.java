package com.mendonca.laryson.arrayslist;

/* Desafio 02: Removendo elementos duplicados
 * Descrição: Crie um programa que permita ao usuário
 * adicionar nomes a um ArrayList. Depois, remova os nomes
 * duplicados mantendo apenas uma ocorrência de cada.
 * Nível: Iniciante
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<String> listaNomesRepetidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.print("Adicione o " + (i+1) + "° nome: ");
            String nome = scanner.next();
            if (listaNomes.contains(nome)){
                listaNomesRepetidos.add(nome);
            } else {
                listaNomes.add(nome);
            }
        }
        System.out.println("----- Nomes na lista -----");
        for (int j = 0; j < listaNomes.size(); j++){
            System.out.println((j+1) + "° Nome: " + listaNomes.get(j));
        }
        System.out.println("----- Nomes Repetidos -----");
        for (int j = 0; j < listaNomesRepetidos.size(); j++){
            System.out.println((j+1) + "° Nome: " + listaNomesRepetidos.get(j));
        }
        scanner.close();
    }
}
