package com.mendonca.laryson.condicionais;

/* Desafio 08: Ano bissexto
 * Descrição: Peça um ano e diga se ele é bissexto.
 * Nivel: Medio
 */

import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano para saber se ele é bissexto.");
        System.out.print("Ano: ");
        ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é BISSEXTO.");
        } else {
            System.out.println("O ano " + ano + " NÃO é BISSEXTO.");
        }

        scanner.close();
    }
}
