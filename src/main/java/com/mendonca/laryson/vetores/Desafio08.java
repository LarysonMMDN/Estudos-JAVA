package com.mendonca.laryson.vetores;

/* Desafio 08: Ordenação Manual (Bubble Sort)
 * Descrição: Implemente o algoritmo Bubble Sort para
 * ordenar um vetor de inteiros em ordem crescente.
 * Nivel: Avançado
 */

import java.util.Random;

public class Desafio08 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        System.out.print("Vetor Inicial: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");

        // Bubble Sort
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        System.out.print("Vetor Final: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");


    }
}
