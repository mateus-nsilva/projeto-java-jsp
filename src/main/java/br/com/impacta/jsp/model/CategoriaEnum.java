package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CategoriaEnum {

    ALIMENTACAO("Alimentação"),
    TRANSPORTE("Transporte"),
    VESTUARIO("Vestuario"),
    PESSOAIS("Pessoais"),
    MORADIA("Moradia"),
    LAZER("Lazer"),
    EDUCACAO("Educação"),
    COMPRAS("Compras"),
    DIVERSAO("Diversão"),
    SAUDE("Saúde");


    private final String nome;

}
