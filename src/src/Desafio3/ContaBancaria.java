package Desafio3;

public class ContaBancaria {
    private double depositar;
    private double sacar;
    private double saldo;


    public void sacar(double valor){
    if (valor <=0) {
        System.out.println("Valor deve ser maior do que zero!");
    } else if ( saldo >= valor){
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo Atual: " +saldo) ;
    } else {
        System.out.println("Saldo insuficiente.");
    }
    }

    public void depositar (double valor){
        if (valor > 0){
            System.out.println("Depósito realizado com sucesso. Saldo atual " +saldo);
        } else {
            System.out.println("Valor deve ser nauir do que zero!");
        }
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
