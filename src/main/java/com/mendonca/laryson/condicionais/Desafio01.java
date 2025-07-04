package com.mendonca.laryson.condicionais;

/* Desafio 01: Par ou ímpar
 * Descrição: Peça ao usuário um número e diga se ele é par ou ímpar.
 * Nivel: Iniciante
 */

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.printf("O numero %d é PAR!", numero);
        else
            System.out.printf("O numero %d é IMPAR!", numero);
        scanner.close();
    }
}
