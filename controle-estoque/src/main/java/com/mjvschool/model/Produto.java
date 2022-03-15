package com.mjvschool.model;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mjvschool.util.NumberUtil;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ean;
    private String descricao;
    @Column(scale = 2, precision = 10)
    private BigDecimal estoque;
    @Column(scale = 2, precision = 10)
    private BigDecimal precoVenda;
    @Column(scale = 2, precision = 10)
    private BigDecimal precoCusto;
    @Enumerated(EnumType.STRING)
    private TipoUnidade tipoUnidade;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEan() {
        return ean;
    }
    public void setEan(String ean) {
        this.ean = ean;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getEstoque() {
        return estoque;
    }
    public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
    }
    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }
    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }
    public TipoUnidade getTipoUnidade() {
        return tipoUnidade;
    }
    public void setTipoUnidade(TipoUnidade tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ id=".concat(String.valueOf(id)));
        sb.append(" ean=".concat(ean));
        sb.append(" descricao=".concat(descricao));
        sb.append(" estoque=".concat(String.valueOf(estoque)));
        sb.append(" precoVenda=".concat(NumberUtil.currencyFormat(precoVenda)).concat("]"));
        return sb.toString();
    }
}
