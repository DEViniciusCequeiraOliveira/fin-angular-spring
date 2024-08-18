package com.vinicius.fin.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "perfil")
    private Set<Acesso> acessos;

    public Perfil(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Perfil(Long id, String descricao, Set<Acesso> acessos) {
        this.id = id;
        this.descricao = descricao;
        this.acessos = acessos;
    }

    public Perfil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescicao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Acesso> getAcessos() {
        return acessos;
    }

}
