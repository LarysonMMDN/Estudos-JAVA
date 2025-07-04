package com.mendonca.laryson.condicionais;

/* Desafio 05: Nota do aluno
 * Descrição: Peça a nota de um aluno (0 a 10) e informe:
 * Abaixo de 5 → "Reprovado"
 * Entre 5 e 7 → "Recuperação"
 * Acima de 7 → "Aprovado"
 * Nivel: Medio
 */

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a 1° nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a 2° nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a 3° nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Digite a 4° nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua nota é " + media);
        System.out.print("Status: ");
        if (media > 7){
            System.out.println("APROVADO!!!");
            System.out.println("Parabéns, seu esforço teve bons frutos.");
        } else if (5 < media && media < 7) {
            System.out.println("EM RECUPERAÇÃO!!!");
            System.out.println("Quase, com um pouco mais de estudos você consegue.");
        } else {
            System.out.println("REPROVADO!!!");
            System.out.println("Err, infelizmente parece que alguém não se conportou esse ano.");
        }

        scanner.close();
    }
}
