package com.mendonca.laryson.vetores;

/* Desafio 07: Eliminar Duplicatas (sem usar Set)
 * Descrição: Dado um vetor, crie um novo
 * vetor que contenha apenas os elementos únicos.
 * Nivel: Avançado
 */

import java.util.Random;

public class Desafio07 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetorFinal = new int[5];
        boolean possui = false;

        Random random = new Random();
        // Criando o vetor
        System.out.print("Vetor Inicial: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(26);
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");

        // Enchendo o segundo vetor
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetorFinal.length; i++) {
                if (vetor[j] == vetorFinal[i]) {
                    possui = true;
                    break;
                } else {
                    possui = false;
                }
            }
            if (!possui){
                vetorFinal[j] = vetor[j];
                possui = false;
            }
        }

        System.out.print("Vetor Final: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetorFinal[i] + ", ");
        }
        System.out.println("Fim.");

    }
}
