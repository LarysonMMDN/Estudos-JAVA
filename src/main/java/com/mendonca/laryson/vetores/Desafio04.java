package com.mendonca.laryson.vetores;

/* Desafio 04: Encontrar o Maior Valor
 * Descrição: Crie um vetor de 10 números inteiros aleatórios (entre 1 e 100)
 * e encontre o maior valor presente no vetor.
 * Nivel: Intermediário
 */

import java.util.Random;

public class Desafio04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];

        System.out.print("Vetor Completo: ");
        for (int k = 0; k < vetor.length; k++){
            vetor[k] = random.nextInt(100);
            System.out.print(vetor[k] + ", ");
        }
        System.out.println("Fim.");


        int maior = 0;
        int menor = 0;
        for (int j = 0; j < vetor.length; j++) {
            if (j == 0) {
                maior = vetor[j];
                menor = vetor[j];
            }

            if (maior < vetor[j]) {
                maior = vetor[j];
            }else if (menor > vetor[j]){
                menor = vetor[j];
            }

        }

        System.out.println("Maior número do Vetor: " + maior);
        System.out.println("Menor número do Vetor: " + menor);

    }
}
