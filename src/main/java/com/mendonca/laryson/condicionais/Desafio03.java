package com.mendonca.laryson.condicionais;

/* Desafio 03: Comparação de dois números
 * Descrição: Peça dois números e diga qual é o maior (ou se são iguais).
 * Nivel: Iniciante
 */

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero01;
        int numero02;

        System.out.print("Digite um número: ");
        numero01 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        numero02 = scanner.nextInt();

        if (numero01 > numero02){
            System.out.printf("O numero %d é maior que o %d.\n", numero01, numero02);
        }
        else if (numero01 < numero02){
            System.out.printf("O numero %d é maior que o %d.\n", numero02, numero01);
        }
        else {
            System.out.println("Os dois numeros são iguais.");
        }
        scanner.close();
    }
}
