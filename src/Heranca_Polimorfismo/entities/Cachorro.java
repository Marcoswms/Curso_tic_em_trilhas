package Heranca_Polimorfismo.entities;

import Heranca_Polimorfismo.application.AnimalDeEstimacao;

public class Cachorro extends AnimalDeEstimacao {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au...");
    }

}

/* OBSERVAÇÕES:

* A classe "Cachorro" agora é uma Entidade, pois Herda os atributos de "AnimalDeEstimação"(Superclasse ou Classe Pai),
  tornando-se uma Subclasse (ou Classe Filha).
*
* */