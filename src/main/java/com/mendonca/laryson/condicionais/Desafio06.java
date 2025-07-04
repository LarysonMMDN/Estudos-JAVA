package com.mendonca.laryson.condicionais;

/* Desafio 06: Dia da semana
 * Descrição: Peça ao usuário um dia da semana e imprima uma mensagem diferente para cada dia.
 * Nivel: Medio
 */

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String diaSemana;
        System.out.print("Digite um dia da semana: ");
        diaSemana = scanner.next();

        diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1).toLowerCase();
        if (diaSemana.length() > 7 && diaSemana.contains("-feira")) {
            diaSemana = diaSemana.replace("-feira", "");
        }

        if ("Segunda".equals(diaSemana)) {
            System.out.println("Segunda: O dia que a preguiça é quase uma arte.");
        } else if ("Terça".equals(diaSemana)) {
            System.out.println("Terça: Ainda sem motivação, mas a semana começou, né?");
        } else if ("Quarta".equals(diaSemana)) {
            System.out.println("Quarta: O famoso 'meia-semana'... Dá pra ver a luz no fim do túnel.");
        } else if ("Quinta".equals(diaSemana)) {
            System.out.println("Quinta: O dia que já começa a cheirar o final de semana.");
        } else if ("Sexta".equals(diaSemana)) {
            System.out.println("Sexta: Finalmente! A recompensa pelo esforço de toda a semana.");
        } else if ("Sabado".equals(diaSemana)) {
            System.out.println("Sábado: O melhor dia, mas parece que sempre passa rápido demais...");
        } else if ("Domingo".equals(diaSemana)) {
            System.out.println("Domingo: O dia de reflexão... ou de procrastinação mesmo.");
        } else {
            System.out.println("'" + diaSemana + "' não é um dia da semana, amigo. Volta pro calendário.");
        }

        scanner.close();
    }
}
