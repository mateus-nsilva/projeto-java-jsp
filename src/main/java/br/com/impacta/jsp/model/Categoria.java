package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Categoria {

    Alimentação("ALIMENTACAO", 1),
    Transporte("TRANSPORTE", 2),
    Vestuario("VESTUARIO", 3),
    Pessoais("PESSOAIS", 4),
    Moradia("MORADIA", 5),
    Lazer("LAZER", 6),
    Educação("EDUCACAO", 7),
    Compras("COMPRAS", 8),
    Diversão("DIVERSAO", 9);

    private final String nome;
    private final long id;
}
