package com.mendonca.laryson.condicionais;

/* Desafio 04: Verificardor de número
 * Descrição: Verificar se um número é positivo, negativo ou zero
 * Nivel: Iniciante
 */

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Esse número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("Esse número é NEGATIVO.");
        } else {
            System.out.println("Esse número é ZERO.");
        }

        scanner.close();
    }
}
