package desafio5_tava10x;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        contaCorrente.depositar(500);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.consultarSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        contaPoupanca.depositar(500);  // Depósito de 500 com taxa
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.consultarSaldo());


    }
}
