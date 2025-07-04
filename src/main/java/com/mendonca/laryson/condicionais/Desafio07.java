package com.mendonca.laryson.condicionais;

/* Desafio 07: Calculadora simples
 * Descrição: Peça dois números e uma operação (+, -, *, /) e calcule o resultado.
 * Nivel: Medio
 */

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero01, numero02;
        int operacao;
        System.out.println("--------------------------------");
        System.out.print("Digite o primeiro número: ");
        numero01 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero02 = scanner.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("[ 1 ] Adição");
        System.out.println("[ 2 ] Subtração");
        System.out.println("[ 3 ] Divisão");
        System.out.println("[ 4 ] Multiplição");
        System.out.print("Digite a operação: ");
        operacao = scanner.nextInt();
        System.out.println("--------------------------------");

        if (operacao == 1) {
            System.out.println("Operação: Adição");
            System.out.printf("Conta: %.2f + %.2f \n", numero01, numero02);
            System.out.printf("Resultado: %.2f \n", numero01+numero02);
        } else if (operacao == 2) {
            System.out.println("Operação: Subtração");
            System.out.printf("Conta: %.2f - %.2f \n", numero01, numero02);
            System.out.printf("Resultado: %.2f\n", numero01-numero02);
        } else if (operacao == 3) {
            System.out.println("Operação: Divisão");
            System.out.printf("Conta: %.2f ÷ %.2f \n", numero01, numero02);
            System.out.printf("Resultado: %.2f\n", numero01/numero02);
        } else if (operacao == 4) {
            System.out.println("Operação: Multiplição");
            System.out.printf("Conta: %.2f X %.2f \n", numero01, numero02);
            System.out.printf("Resultado: %.2f \n", numero01*numero02);
        } else {
            System.out.println("Operação invalida.");
        }
        System.out.println("--------------------------------");
        scanner.close();
    }
}
