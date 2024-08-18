package com.vinicius.fin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ACESSO")
public class Acesso {

    @Id
    private Long id;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    public Acesso() {
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

}
