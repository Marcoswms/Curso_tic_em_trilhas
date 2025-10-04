package Classes_metodos_modificadores_de_acesso.application;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Corolla", "Toyota", 2024);

        meuCarro.anoDeFabricacao = 2023;
    }
}
/* Observações:

* meuCarro - Torna-se um Objeto a partir do momento em que é instanciado (carro = new Carro);
* meuCarro. - Acessa um Objeto para realizar alguma alteração em seu atributo;

* Modificadores de acesso:

* Public - Acesso livre de qualquer lugar a um bloco de código;
* Private - Só é acessível a partir da Classe em que ele foi definido;
* Protected - Acessível por outros pacotes e subclasses em pacotes diferentes;
* Default - Quando não definimos nenhum modificador de acesso, o Java o define como "Private" por padrão.
*/
