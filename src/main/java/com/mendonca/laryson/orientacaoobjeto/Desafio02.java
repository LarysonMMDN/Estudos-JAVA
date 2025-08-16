package com.mendonca.laryson.orientacaoobjeto;

/* Desafio 02: Construtores personalizados
 * Descrição: Crie uma classe Carro com atributos marca,
 * modelo e ano. Implemente um construtor que inicialize
 * todos os atributos e outro construtor vazio.
 * Nível: Iniciante
 */

class Carro {
    String modelo;
    String marca;
    int ano;

    public Carro() {}

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void mostrarDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}


public class Desafio02 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Primeiro Carro
        Carro car1 = new Carro();
        car1.setModelo("Onix");
        car1.setMarca("Chevrolet");
        car1.setAno(2023);

        // Segundo Carro
        Carro car2 = new Carro("Santana", "volkswagen", 1995);

        System.out.println("-----------------------");
        car1.mostrarDados();
        System.out.println("-----------------------");
        car2.mostrarDados();

    }
}