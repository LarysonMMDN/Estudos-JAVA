package com.mendonca.laryson.arrayslist;

/* Desafio 01: Criando uma lista de compras
 * Descrição: Crie um programa que permita adicionar itens a uma lista de
 * compras usando um ArrayList, e ao final exiba todos os itens adicionados.
 * Nível: Iniciante
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int escolha;
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("           MENU ESTOQUE");
            System.out.println("--------------------------------");
            System.out.println(" [ 1 ] Adicionar item");
            System.out.println(" [ 2 ] Remover item");
            System.out.println(" [ 3 ] Listar todos os itens");
            System.out.println(" [ 4 ] Finalizar programa");
            System.out.println("--------------------------------");
            System.out.print("Sua escolha: ");
            escolha = scanner.nextInt();

            String item;
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    item = scanner.next();
                    estoque.add(item);
                    System.out.println("Item Adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do item: ");
                    item = scanner.next();
                    estoque.remove(item);
                    System.out.println("Item Removido com sucesso!");
                    break;
                case 3:
                    System.out.println("------ Lista com todos os item ------");
                    if (estoque.size() > 0){
                        for (int i = 0; i < estoque.size(); i++){
                            System.out.println("Item " + (i+1) + ": " + estoque.get(i));
                        }
                    } else {
                        System.out.println("Não há nada no estoque no momento.");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
            }
            Thread.sleep(2000);
        }

    }
}
