package com.mendonca.laryson.orientacaoobjeto;

/* Desafio 03: Encapsulamento na prática
 * Descrição: Modifique a classe ContaBancaria
 * para que os atributos sejam privados e crie métodos
 * get e set para acessá-los e modificá-los de forma controlada.
 * Nível: Iniciante
 */

import java.util.Scanner;

class ContaBancaria {
    private String nomeUsuario;
    private double saldoConta;

    public ContaBancaria() {}

    public ContaBancaria(String nomeUsuario, double saldoConta) {
        this.nomeUsuario = nomeUsuario;
        this.saldoConta = saldoConta;
    }

    public void mostrarDados(){
        System.out.println("Nome de Usuario: " + nomeUsuario);
        System.out.println("Saldo da conta: " + saldoConta);
    }

    public void reaizarDeposito(double deposito) {
        this.saldoConta += deposito;
    }

    public void reaizarSaque(double saque) {
        if (this.saldoConta > 0 && saque <= this.saldoConta) {
            this.saldoConta -= saque;
            System.out.println("Saque Efetuado com sucesso.");
        } else {
            System.out.println("Saldo Insuficiente para realizar saque.");
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta01 = new ContaBancaria();

        System.out.println("---------- CRIE SUA CONTA ---------");
        System.out.print("Digite seu nome: ");
        conta01.setNomeUsuario(scanner.next());
        System.out.print("Digite seu saldo atual: ");
        conta01.setSaldoConta(scanner.nextDouble());
        System.out.println("COnta criada com sucesso!!");
        System.out.println("-----------------------------------");

        while (true){
            System.out.println("----------- JAVA BANK -------------");
            System.out.println(" [ 1 ] Ver Seus Dados ");
            System.out.println(" [ 2 ] Realizar Depositos");
            System.out.println(" [ 3 ] Realizar Saques");
            System.out.println(" [ 4 ] Sair do Sistema");
            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();
            System.out.println("-----------------------------------");

            if (escolha == 1) {
                conta01.mostrarDados();
            } else if (escolha == 2){
                System.out.print("Digite o valor do Deposito: ");
                conta01.reaizarDeposito(scanner.nextDouble());
                System.out.println("Deposito Efetuado com sucesso.");
            } else if (escolha == 3){
                System.out.print("Digite o valor do Saque: ");
                conta01.reaizarSaque(scanner.nextDouble());
            } else if (escolha == 4){
                System.out.println("Finalizando Banco....");
                break;
            }
            System.out.println("-----------------------------------");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();

    }
}