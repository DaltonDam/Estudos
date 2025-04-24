package desafio5_tava10x;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {

    }

    @Override
    public abstract double depositar(double valor);
}
