package br.com.alura.modelos;

public class Moeda {
    private String conversao;

    public Moeda(MoedaConvertida moedaConvertida) {
        this.conversao = moedaConvertida.conversion_result();
    }

    @Override
    public String toString() {
        return "Valor da Conversão: " + conversao;
    }
}
