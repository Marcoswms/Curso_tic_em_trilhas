package com.example.ticEmTrilhasDemo.meuPacote;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManipuladorDeStingsTests {
    @Test
    void recortaTextoQuandoTamanhoForMenorQueZeroJogaExcecao() {
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = -1;

        // execução
        Assertions.assertThrows(RuntimeException.class, () -> manipuladorDeStrings.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaProprioTextoQuandoForMaiorQueTamanhoDoTexto() {
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = 60;

        // execução
        Assertions.assertEquals("A dona aranha subiu pela parede", manipuladorDeStrings.recortaTexto(texto, tamanho));
    }

    @Test
    void recortaTextoRetornaTextoComReticenciasCasoTamanhoSejaValido() {
        // configuração
        ManipuladorDeStrings manipuladorDeStrings = new ManipuladorDeStrings();
        String texto = "A dona aranha subiu pela parede";
        int tamanho = 13;

        // execução
        Assertions.assertEquals("A dona aranha...", manipuladorDeStrings.recortaTexto(texto, tamanho));
    }
}
/* OBSERVAÇÕES:

 * Você poderá executar cada bloco de teste de forma indifvidual para garantir que esteja funcionando e, ao final, realizar
 o teste completo colocando a classe inteira em execução.

 * Assertions.assertThrows() - Verifica se a Chamada do Método nos retornará uma exceção.
 */