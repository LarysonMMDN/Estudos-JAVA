package com.mendonca.laryson.vetores;

/* Desafio 02: Soma dos Elementos
 * Descrição: Crie um vetor de inteiros e calcule a soma de todos os valores.
 * Nivel: Iniciante
 */

public class Desafio02 {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        int somaVetor = 0;

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * 26;
            somaVetor += vetor[i];
        }
        System.out.println("A soma de todos os itens dentro do vetor é: " + somaVetor);

    }
}
