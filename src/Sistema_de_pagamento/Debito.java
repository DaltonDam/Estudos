package Sistema_de_pagamento;

public class Debito extends Pagamento{

    public Debito(double saldo) {
        super(saldo);
    }

    private double calcularTaxa(double valor) {
        return valor * 0.0;
    }

    @Override
    public void processar(double valor) {
        double taxa = calcularTaxa(valor);
        double resultado = valor + taxa;
        if(saldo >= valor) {
            saldo -= valor;
            System.out.printf("Progamento por débito de R$%.2f%nTaxa: R$%.2f%nTotal pago: R$%.2f%n%n", valor, taxa, resultado);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


}
