package com.mendonca.laryson.condicionais;

/* Desafio 02: Maior de idade
 * Descrição: Peça a idade do usuário e diga se ele é maior de idade (18 ou mais) ou menor.
 * Nivel: Iniciante
 */

import java.util.Scanner;
import java.time.LocalDate;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = LocalDate.now().getYear();
        int dataNasc;
        int idade;

        System.out.print("Me diga o seu Ano de Nascimento: ");
        dataNasc = scanner.nextInt();

        idade = anoAtual - dataNasc;

        if (idade > 18) {
            System.out.printf("Com %d anos você ja é maior de idade, pode se alistar no Serviço Militar", idade);
        } else if (idade < 18) {
            System.out.printf("Com %d anos você é menor de idade, não pode se alistar no Serviço Militar", idade);
        }
        scanner.close();

    }
}
