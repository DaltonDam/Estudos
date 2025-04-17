package Sistema_de_pagamento;

public class Main {
    public static void main(String[] args) {
        Credito credito = new Credito(200.00);
        credito.processar(50.00);

        Debito debito = new Debito(80.00);
        debito.processar(27.99);

        Pix pix = new Pix(1200.00);
        pix.processar(453.65);


    }
}
