package com.mendonca.laryson.orientacaoobjeto;

/* Desafio 04: Herança básica
 * Descrição: Crie uma classe Animal com o metodo falar() e
 * duas subclasses (Cachorro e Gato) que sobrescrevem esse
 * metodo com sons diferentes.
 * Nível: Intermediário
 */
import java.util.Scanner;

class Animal {
    String nome;
    String raca;

    public Animal() {}

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void falar() {
        System.out.println(".......");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

class Cachorro extends Animal {
    @Override
    public void falar() {
        System.out.println("Au Au Au");
    }
}

class Gato extends Animal {
    @Override
    public void falar(){
        System.out.println("Miau Miau Miau");
    }
}

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        cachorro.falar();
        gato.falar();

        scanner.close();
    }
}