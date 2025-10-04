package Heranca_Polimorfismo.entities;

import Heranca_Polimorfismo.application.AnimalDeEstimacao;

public class Gato extends AnimalDeEstimacao {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau...");
    }

}
