package Sistema_de_pagamento;

public class Credito extends Pagamento{
    public Credito(double saldo) {
        super(saldo);
    }

    private double calcularTaxa(double valor) {
        return valor * 0.5;
    }

    @Override
    public void processar(double valor) {
        double taxa = calcularTaxa(valor);
        double resultado = valor + taxa;
        if(saldo >= valor) {
            saldo -= valor;
            System.out.printf("Progamento por crédito de R$%.2f%nTaxa: R$%.2f%nTotal pago: R$%.2f%n%n", valor, taxa, resultado);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
