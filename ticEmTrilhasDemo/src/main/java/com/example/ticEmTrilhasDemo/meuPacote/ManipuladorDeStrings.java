package com.example.ticEmTrilhasDemo.meuPacote;

public class ManipuladorDeStrings {

    public String recortaTexto(String texto, int tamanho) {
        if (tamanho < 0) throw  new RuntimeException("O tamanho não pode ser menor que Zero.");
        if (tamanho > texto.length()) return texto;

        String resultado = texto.substring(0, tamanho);
        resultado = resultado + "...";
        return resultado;
    }
}
/* OBSERVAÇÕES:

* Testes Unitários - São realizados dentro da pasta "test" e todos os arquivos criados na pasta "main" que precisará
  de testes, precisará ter uma cópia com o mesmo caminho na pasta "test".
*/