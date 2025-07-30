package com.mendonca.laryson.vetores;

/* Desafio 09: Vetor de Caracteres: Palíndromo
 * Descrição: Crie um vetor char[] e verifique se
 * a palavra é um palíndromo (mesmo de trás pra frente).
 * Nivel: Avançado
 */

import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vetor = new char[20];

        String frase = "";
        System.out.println("Escreva uma frase e descubra se ela é um palíndromo!");
        System.out.print("Frase: ");
        frase = scanner.next();

        for (int i = 0; i < vetor.length; i++ ) {
            // vetor[i] = frase[i];
        }



        scanner.close();
    }
}
