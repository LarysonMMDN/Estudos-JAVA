package com.mendonca.laryson.vetores;

/* Desafio 05: Vetor de boolean: Verificar Verdades
 * Descrição: Dado um vetor boolean[] respostas = {true, false, true, true, false},
 * conte quantos true existem.
 * Nivel: Intermediário
 */

import java.util.Random;

public class Desafio05 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[] vetor = new boolean[5];

        System.out.print("Vetor completo: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextBoolean();
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("Fim.");

        int contador = 0;
        for (boolean num : vetor) {
            if (num)
                contador++;
        }

        System.out.println("No vetor existem " + contador + " valores do tipo Verdadeiro.");
    }
}
