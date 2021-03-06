package com.mjvschool.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 60)
    private String descricao;
    @Column(scale = 2, precision = 10)
    private BigDecimal margemLucroMedia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getMargemLucroMedia() {
        return margemLucroMedia;
    }

    public void setMargemLucroMedia(BigDecimal margemLucroMedia) {
        this.margemLucroMedia = margemLucroMedia;
    }
}
