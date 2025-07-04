package com.mendonca.laryson.condicionais;

/* Desafio 09: Validador de senha
 * Descrição: Peça uma senha ao usuário. Se for "12345", diga "Acesso concedido", senão, "Senha incorreta".
 * Nivel: Medio - Simples ate de mais
 */

import java.util.Scanner;
import java.util.Random;


public class Desafio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int senha = random.nextInt(10) + 1;;
        int chute;

        System.out.println("Tente adivinhar a senha(De 1 a 10), você tem UMA chance.");
        System.out.print("Chute: ");
        chute = scanner.nextInt();

        if (chute == senha){
            System.out.println("PARABÉNS, Acesso concedido");
            System.out.println("Sinceramente eu não sei como você acertou de primeira.");
        } else {
            System.out.println("ERROU, Senha incorreta");
            System.out.println("Você não acreditou que ia conseguir só na base do chute neh? Segurança de alto nivel.");
        }

        scanner.close();
    }
}