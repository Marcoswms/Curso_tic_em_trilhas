package Interface.entities;

import Interface.repository.Tarefas;

public class FestaDeAniversario implements Tarefas {
    @Override
    public void decorar() {
        System.out.println("Comprar Balões");
        System.out.println("Colocar Fitas");
    }

    @Override
    public void chamarConvidados() {
        System.out.println("Chamar João");
        System.out.println("Chamar Maria");
    }

    @Override
    public void comprarComida() {
        System.out.println("Comprar Bolo");
        System.out.println("Comprar Salgados");
    }
}
/* OBSERVAÇÕES:
 * Override - Indica que o método utilizado têm a intenção de Sobreescrever o método da Superclasse, ex:
   . A interface "Tarefas" têm seu método "decorar", mas não possui nenhuma regra nele. A Subclasse "FestaDeAniversario"
   têm como implementação a interface "Tarefas" e por isso acaba herdando seus métodos, porém desejamos "Sobreescrever"
   o comportamente de um método herdado, então comocamos o @Override para sinalizar esta alteração.
 */