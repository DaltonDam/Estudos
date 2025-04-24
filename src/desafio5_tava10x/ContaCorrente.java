package desafio5_tava10x;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double depositar(double valor) {
        return valor;
    }


}
