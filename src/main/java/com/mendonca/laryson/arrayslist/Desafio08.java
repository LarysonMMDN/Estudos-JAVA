package com.mendonca.laryson.arrayslist;

/* Desafio 08: Implementando uma fila com ArrayList
 * Descrição: Implemente o comportamento de uma fila
 * (FIFO) usando um ArrayList, com operações de entrada e saída.
 * Nível: Avançado
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio08 {
    public static void mostrarLista(ArrayList<String> lista, String mensagem) {
        System.out.println(mensagem);
        if (lista.size() > 0){
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(" - " + lista.get(i));

                if ((i + 1) % 5 == 0)
                    System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Vazia.\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> livrosListaEspera = new ArrayList<>();

        boolean mainloop = true;
        while (mainloop) {
            System.out.println("------- Sua Biblioteca Online -------");
            System.out.println(" 1 - Adicionar livros à lista de espera");
            System.out.println(" 2 - Remover livros da lista de espera");
            System.out.println(" 3 - Ver lista de espera");
            System.out.println(" 4 - Sair");
            System.out.println("-------------------------------------");

            System.out.print("Sua escolha: ");
            int escolhaMenu = scanner.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.println("Digite um livro na lista de espera: ");
                    String livro = scanner.next();
                    livrosListaEspera.add(livro);
                    break;
                case 2:
                    if (!livrosListaEspera.isEmpty()) {
                        System.out.println("Removendo livro: " + livrosListaEspera.get(0));
                        livrosListaEspera.remove(0);
                    } else {
                        System.out.println("A lista já está vazia!");
                    }
                    break;
                case 3:
                    mostrarLista(livrosListaEspera, "Livros na lista de espera ");
                    break;
                case 4:
                    System.out.println("Finalizando...");
                    mainloop = false;
                    break;
            }
        }
        scanner.close();
    }
}
