package Interface.application;

import Interface.entities.FestaDeAniversario;

public class Main {
    public static void main(String[] args) {
        FestaDeAniversario festa = new FestaDeAniversario();

        festa.decorar();
        System.out.println("-------------------------------");
        festa.chamarConvidados();
        System.out.println("-------------------------------");
        festa.comprarComida();
    }
}