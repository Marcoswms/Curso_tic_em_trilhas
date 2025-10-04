package Heranca_Polimorfismo.application;

import Heranca_Polimorfismo.entities.Cachorro;
import Heranca_Polimorfismo.entities.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro("Rex", 2);

        meuCachorro.mostraNome();
        meuCachorro.mostraIdade();
        meuCachorro.emitirSom();
        meuCachorro.comer();
        meuCachorro.dormir();

        System.out.println("----------------------------------------------");

        Gato meuGato = new Gato("Persian", 3);

        meuGato.mostraNome();
        meuGato.mostraIdade();
        meuGato.emitirSom();
        meuGato.comer();
        meuGato.dormir();
    }
}
