package com.mendonca.laryson.condicionais;

/* Desafio 10: Classificação de IMC (Índice de Massa Corporal)
 * Descrição: Peça peso e altura, calcule o IMC e informe:
 * Abaixo de 18.5 → Abaixo do peso
 * Entre 18.5 e 24.9 → Peso ideal
 * Entre 25 e 29.9 → Sobrepeso
 * Acima de 30 → Obesidade
 * Nivel: Medio
 */

import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("----------- CÁLCULO DO IMC -----------");
        System.out.print("Digite seu Peso (kg): ");
        peso = scanner.nextDouble();
        System.out.print("Digite sua Altura (m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("\n----------- RESULTADO DO IMC -----------");
        System.out.printf("Seu IMC é : %.2f\n", imc);

        System.out.print("Status: ");

        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO");
            System.out.println("Você está ABAIXO do peso recomendado pelo índice.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("PESO NORMAL");
            System.out.println("Você está no peso IDEAL recomendado pelo índice.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("SOBREPESO");
            System.out.println("Você está UM POUCO acima do peso ideal recomendado pelo índice.");
        } else {
            System.out.println("OBESIDADE");
            System.out.println("Você está MUITO acima do peso ideal recomendado pelo índice.");
        }
        System.out.println("---------------------------------------");
        scanner.close();
    }
}
