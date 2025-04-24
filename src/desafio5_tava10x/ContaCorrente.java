package desafio5_tava10x;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }


}
