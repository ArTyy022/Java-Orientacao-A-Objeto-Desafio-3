package Desafio2;

public class PrincipalAnimal {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.emitirSom();


        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
