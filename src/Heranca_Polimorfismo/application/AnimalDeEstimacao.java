package Heranca_Polimorfismo.application;

import java.sql.SQLOutput;

public abstract class AnimalDeEstimacao {
    String nome;
    int idade;

    public AnimalDeEstimacao(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void comer(){
        System.out.println(nome + " está comendo...");
    }
    public void dormir(){
        System.out.println(nome + " está dormindo...");
    }
    public void mostraNome(){
        System.out.println(nome);
    }
    public void mostraIdade(){
        System.out.println(idade + " ano(s) de idade");
    }

    public abstract void emitirSom();

}
/* OBSERVAÇÕES:

* Herança - É quando uma Subclasse herda as características de uma Superclasse, ex:
    . A Subclasse "Cachorro" herdará as características da SuperClasse "AnimalDeEstimacao".

* Polimorfismo - É um método que poderá ter comportamentos diferentes nas Subclasses que a herdará, ex:
    . "Cachorro" herdará todos os métodos e suas regras da Superclasse "AnimalDeEstimação", porém o método "emitirSom"
       poderá se comportar de forma diferente dentro da Subclasse "Cachorro".

* abstract - Trata-se de uma classe ou método que NÃO será instanciado, ou seja, é uma classe que servirá como base para
  Subclasses.
*/