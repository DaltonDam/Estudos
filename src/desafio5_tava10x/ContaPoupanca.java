package desafio5_tava10x;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor * 0.99;
        saldo += valorComTaxa;
    }

}
