package com.mendonca.laryson.orientacaoobjeto;

/* Desafio 01: Criando sua primeira classe
 * Descrição: Crie uma classe simples chamada Pessoa com atributos nome e idade, e métodos para exibir essas informações no console.
 * Nível: Iniciante
 */

class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


public class Desafio01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Pessoa p1 = new Pessoa("Laryson Martins", 19);
        p1.mostrarDados();

        Pessoa p2 = new Pessoa("Chaol Westfall", 22);
        p2.mostrarDados();
    }
}