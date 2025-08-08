package Desafio3;

public class ContaPrincipal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Arthur", 636.00, 15.0);

        conta.consultarSaldo();
        conta.depositar(600.0);
        conta.sacar(0);
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();
    }
}