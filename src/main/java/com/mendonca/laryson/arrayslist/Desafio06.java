package com.mendonca.laryson.arrayslist;

/* Desafio 06: Remoção condicional de elementos
 * Descrição: Preencha um ArrayList com números inteiros e remova todos os elementos que sejam múltiplos de 3.
 * Nível: Intermediário
 */

import java.util.ArrayList;
import java.util.Random;

public class Desafio06 {

    public static void mostrarLista(ArrayList lista, String mensagem) {
        System.out.println(mensagem);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");

            if ((i + 1) % 5 == 0)
                System.out.println();
        }
        System.out.println("Fim.\n");
    }

    public static void main(String[] args) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        ArrayList<Integer> naoMultiplos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++){
            int numeroSorteado = random.nextInt(1, 100);

            if (numeroSorteado % 3 == 0)
                multiplos.add(numeroSorteado);
            else
                naoMultiplos.add(numeroSorteado);
        }

        mostrarLista(multiplos, "Os numeros multiplos de 3: ");
        mostrarLista(naoMultiplos, "Os numeros NÃO multiplos de 3: ");

    }
}
