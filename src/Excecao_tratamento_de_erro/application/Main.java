package Excecao_tratamento_de_erro.application;

public class Main {
    public static void main(String[] args) {
        String primeiroNumeroTexto = "20";
        String segundoNumeroTexto = "0";

        try {
            int primeiroNumero = Integer.parseInt(primeiroNumeroTexto);
            int segundoNumero = Integer.parseInt(segundoNumeroTexto);

            if (segundoNumero == 0) {
                throw new RuntimeException("É impossível dividir um número por Zero!");
            }
        } catch (Exception ex) {
            System.out.println("Algo deu errado! A mensagem do sistema foi: " + ex.getMessage());
        }

        System.out.println("Está acontecendo depois do erro.");
    }
}
/*OBSERVAÇÕES:
 * Integer.parseInt(variável) - Converte a a variável de String em int.

 * try - É nosso "Código protegido" pois qualquer erro que aconteça dentro de "try", o código não lançará uma "Exception",
 * mas sim, executará a tratativa que está dentro de "catch".
 *
 * throw new RuntimeException - Lança uma nova tratativa de Exceção (Neste caso uma mensagem)
 * */