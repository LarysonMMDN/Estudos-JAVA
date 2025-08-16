package com.mendonca.laryson.orientacaoobjeto;

/* Desafio 05: Polimorfismo em ação
 * Descrição: Implemente um sistema que armazene
 * objetos de diferentes subclasses de FormaGeometrica
 * (Circulo, Quadrado, Triangulo) em um mesmo array e
 * calcule suas áreas usando polimorfismo.
 * Nível: Intermediário
 */

abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Quadrado extends FormaGeometrica {
    int lado = 2;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}

class Circulo extends FormaGeometrica {
    int Raio;

    public Circulo(int raio) {
        Raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.Raio * this.Raio;
    }
}

class Triangulo extends FormaGeometrica {
    int base;
    int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}

public class Desafio05 {
    public static void main(String[] args) {
        FormaGeometrica[] funcoes = new FormaGeometrica[3];

        funcoes[0] = new Quadrado(4);
        funcoes[1] = new Circulo(4);
        funcoes[2] = new Triangulo(5, 6);

        System.out.println("------ Forma Geometricas ------");
        for (FormaGeometrica forma : funcoes) {
            System.out.println("Nome: " + forma.getClass().getSimpleName());
            System.out.println("Area: " + Math.floor(forma.calcularArea()));
            System.out.println("-------------------------------");
        }
    }
}