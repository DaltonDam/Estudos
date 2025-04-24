package desafio5_tava10x;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor) {
        return valor * 0.99;
    }

}
