package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

//    @Temporal(TemporalType.DATE)
    private String data;
    private BigDecimal valor;
    private String observacoes;

}


