package Sistema_de_pagamento;

public class Pagamento {
    double saldo;

    public Pagamento(double saldo) {
        this.saldo = saldo;
    }
    public void processar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.printf("Progamento de R$%.2f%nSaldo atual: %.2f", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
