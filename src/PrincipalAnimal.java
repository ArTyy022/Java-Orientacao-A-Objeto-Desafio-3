import Desafio2.Animal;
import Desafio2.Cachorro;
import Desafio2.Gato;

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
