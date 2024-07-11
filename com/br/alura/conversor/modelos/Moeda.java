package com.br.alura.conversor.modelos;

import com.google.gson.annotations.SerializedName;

public class Moeda {

    @SerializedName("base_code")
    private String sigla;
    @SerializedName("target_code")
    private String moedaDeComparacao;
    @SerializedName("time_last_update_utc")
    private String ultimaCotacao;
    @SerializedName("conversion_rate")
    private double conversaoUnitaria;
    @SerializedName("conversion_result")
    private double conversaoFinal;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getMoedaDeComparacao() {
        return moedaDeComparacao;
    }

    public void setMoedaDeComparacao(String moedaDeComparacao) {
        this.moedaDeComparacao = moedaDeComparacao;
    }

    public String getUltimaCotacao() {
        return ultimaCotacao;
    }

    public void setUltimaCotacao(String ultimaCotacao) {
        this.ultimaCotacao = ultimaCotacao;
    }

    public double getConversaoUnitaria() {
        return conversaoUnitaria;
    }

    public void setConversaoUnitaria(double conversaoUnitaria) {
        this.conversaoUnitaria = conversaoUnitaria;
    }

    public double getConversaoFinal() {
        return conversaoFinal;
    }

    public void setConversaoFinal(double conversaoFinal) {
        this.conversaoFinal = conversaoFinal;
    }

    @Override
    public String toString() {
        return "Moeda {" +
                "Sigla = " + sigla +
                ", Moeda comparada = " + moedaDeComparacao +
                ", última atualização de cotação: " + ultimaCotacao +
                ", Conversão unitária da moeda = " + conversaoUnitaria +
                ", Conversão final desejada = " + conversaoFinal +
                '}';
    }
}
