package com.mendonca.laryson.vetores;

/* Desafio 03: Contar Números Pares
 * Descrição: Dado um vetor de inteiros, conte e imprima quantos valores são pares.
 * Nivel: Iniciante
 */

import java.util.Random;

public class Desafio03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];

        System.out.print("Valores do vetor: ");
        for (int j = 0; j < 10; j++){
            vetor[j] = rand.nextInt(26);
            System.out.print(vetor[j] + ", ");

        }
        System.out.println("Fim.");

        System.out.print("Valores PAR do vetor: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0 && vetor[i] != 0)
                System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");

    }
}
