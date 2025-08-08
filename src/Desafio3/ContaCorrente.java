package Desafio3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(String titular, double saldoInicial, double tarifaMensal) {
        super(titular, saldoInicial);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para cobrar a tarifa mensal.");
        }
    }
}
