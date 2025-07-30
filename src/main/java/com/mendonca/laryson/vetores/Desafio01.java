package com.mendonca.laryson.vetores;

/* Desafio 01: Preenchimento Simples
 * Descrição: Crie um vetor de 5 posições do tipo int e preencha-o com os números de 1 a 5.
 * Depois, exiba todos os valores no console.
 * Nivel: Iniciante
 */

public class Desafio01 {
    public static void main(String[] args) {
        int[] vetor = {4, 0, 0, 2, 8, 9, 2, 2};
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição " + i + " corresponde ao valor: " + vetor[i]);
        }
    }
}
