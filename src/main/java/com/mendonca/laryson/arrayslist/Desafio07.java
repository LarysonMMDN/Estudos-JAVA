package com.mendonca.laryson.arrayslist;

/* Desafio 07: Agrupando elementos por categoria
 * Descrição: Crie uma lista de produtos com categorias.
 * (ex: "Fruta", "Legume", "Carne") e agrupe os produtos
 * por categoria usando ArrayLists separados.
 * Nível: Intermediário
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio07 {
    public static void mostrarLista(ArrayList<String> lista, String mensagem) {
        System.out.println(mensagem);
        if (lista.size() > 0){
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i) + ", ");

                if ((i + 1) % 5 == 0)
                    System.out.println();
            }
            System.out.println("Fim.\n");
        } else {
            System.out.println("Vazia.\n");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();
        ArrayList<String> listaCarnes = new ArrayList<>();
        ArrayList<String> listaLegumes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------- Menu -------------");
            System.out.println(" 1 - Adicionar Produto\n 2 - Ver Produtos\n 3 - Sair");
            System.out.println("------------------------------");
            System.out.print("Sua escolha: ");
            int escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                System.out.println("----- Adicione um Produto -----");
                System.out.print("Produto: ");
                String produto = scanner.next();

                System.out.println("\n- Digite a categoria do Produto -");
                System.out.println(" 1 - Frutas\n 2 - Carnes\n 3 - Legumes");
                System.out.println("-----------------------------------");
                System.out.print("Sua escolha: ");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        listaFrutas.add(produto);
                        break;
                    case 2:
                        listaCarnes.add(produto);
                        break;
                    case 3:
                        listaLegumes.add(produto);
                        break;
                }
            } else if (escolhaMenu == 2) {
                System.out.println("------------ Itens --------------");
                mostrarLista(listaFrutas, "Lista de Frutas");
                mostrarLista(listaCarnes, "Lista de Carnes");
                mostrarLista(listaLegumes, "Lista de Legumes");
            } else if (escolhaMenu == 3) {
                System.out.println("Finalizando Programa...");
                break;
            } else {
                System.out.println("Opção Invalida!!");
            }
        }
        scanner.close();
    }
}
