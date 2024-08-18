package com.vinicius.fin.DTO;

import java.math.BigDecimal;

import com.vinicius.fin.models.Conta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaDTO {

    private Long id;
    private String descricao;
    private BigDecimal valor;

    public ContaDTO(Conta conta) {
        this.id = conta.getId();
        this.descricao = conta.getDescricao();
        this.valor = conta.getValor();
    }
}
