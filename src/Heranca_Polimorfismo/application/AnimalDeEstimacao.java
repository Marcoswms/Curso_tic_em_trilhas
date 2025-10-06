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

* Os 4 Pilares da Orientação a Objetos:

* Herança - É quando uma Subclasse herda as características de uma Superclasse, ex:
    . A Subclasse "Cachorro" herdará as características da SuperClasse "AnimalDeEstimacao".

* Polimorfismo - É um método que poderá ter comportamentos diferentes nas Subclasses que a herdará, ex:
    . "Cachorro" herdará todos os métodos e suas regras da Superclasse "AnimalDeEstimação", porém o método "emitirSom"
       poderá se comportar de forma diferente dentro da Subclasse "Cachorro".

* Encapsulamento - É a capacidade de esconder detalhes da implementação do Objeto expondo apenas o que deverá ser
  acessado publicamente, adicionando segurança de acesso ao código.

* Abstração (abstract) - Trata-se de uma classe ou método que NÃO será instanciado, ou seja, é uma classe que servirá
  como base ou modelo para Subclasses. Uma Superclasse também pode derivar de uma classe abstract, ex:

  . "Veiculo" - Será nossa classe abstrata (Nosso modelo/esqueleto e possui o método "ligar");
  . "Carro" e "Moto" - Serão nossas SubClasses (Herdam os métodos de "Veículo". Possuem métodos próprios como: "Modelo"
    e "Ano". O método herdado "ligar" têm comportamentos diferentes em cada objeto, pois um Carro e uma Moto possuem
    "sistemas" diferentes para se ligar, assim como possuem seus próprios modelos e ano de lançamento.)
*/