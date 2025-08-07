package com.mendonca.laryson.arrayslist;

/* Desafio 05: Lista de tarefas com prioridades
 * Descrição: Crie um sistema simples de lista de tarefas
 * em que cada tarefa tenha uma prioridade. Permita exibir
 * as tarefas ordenadas por prioridade.
 * Nível: Intermediário
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Desafio10 {
    public static void main(String[] args) {
        ArrayList<String> listaTarefa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("--------------------------------");
            System.out.println("        LISTA DE TEREFA");
            System.out.println("--------------------------------");
            System.out.println(" [ 1 ] Adicionar item");
            System.out.println(" [ 2 ] Remover item");
            System.out.println(" [ 3 ] Listar todos os itens");
            System.out.println(" [ 4 ] Finalizar programa");
            System.out.println("--------------------------------");
            System.out.print("Sua escolha: ");
            int escolha = scanner.nextInt();

            String item;
            String prioridade;
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    item = scanner.next();
                    System.out.println("[ 0 ] Alta");
                    System.out.println("[ 1 ] Media");
                    System.out.println("[ 2 ] Baixa");
                    System.out.println("Qual é a prioridade? ");
                    prioridade = scanner.next();
                    listaTarefa.add(prioridade + " - " + item);
                    System.out.println("Tarefa Adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do item: ");
                    item = scanner.next();
                    listaTarefa.remove("0 - " + item);
                    listaTarefa.remove("1 - " + item);
                    listaTarefa.remove("2 - " + item);
                    System.out.println("Item Removido com sucesso!");
                    break;
                case 3:
                    Collections.sort(listaTarefa);
                    if (listaTarefa.size() > 0){
                        for (int i = 0; i < listaTarefa.size(); i++){
                            System.out.println(listaTarefa.get(i));
                        }
                    } else {
                        System.out.println("Não há nenhuma tarefa no momento.");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando sistema...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
