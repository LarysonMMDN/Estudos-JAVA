package com.mendonca.laryson.vetores;

/* Desafio 06: Inverter o Vetor
 * Descrição: Dado um vetor, crie um novo vetor
 * com os mesmos elementos na ordem invertida.
 * Nivel: Intermediário
 */

import java.util.Random;

public class Desafio06 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] vetorFinal = new int[10];
        Random random = new Random();

        System.out.print("Vetor Inicial: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(26);
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");

        System.out.print("Vetor Final: ");
        for (int i = 0; i < vetorFinal.length; i++) {
            vetorFinal[i] = vetor[(vetor.length - 1) - i];
            System.out.print(vetorFinal[i] + ", ");
        }
        System.out.println("Fim.");

    }
}

/* Uma Solução que pesquisei mas na primeira tentativa tentei fazer não consegui.

// Inversão no próprio vetor com apenas uma variável auxiliar
for (int i = 0; i < vetor.length / 2; i++) {
    int temp = vetor[i];
    vetor[i] = vetor[vetor.length - 1 - i];
    vetor[vetor.length - 1 - i] = temp;
}

Fonte: (ChatGPT)
 */
