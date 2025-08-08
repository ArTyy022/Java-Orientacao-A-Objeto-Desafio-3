package Desafio1;

public class CarroPrincipal {
    public static void main(String[] args) {
        ModeloCarro modelo = new ModeloCarro();
        modelo.definirModelo("Lancer");
        modelo.definirPrecos(50000, 60000, 88000);
        modelo.exibirInfo();
    }
}
