package com.example.model;

import jakarta.persistence.*;

@Entity
public class ItemPeca {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "peca_id")
    private Peca peca;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private OrdemServico ordemServico;

    public ItemPeca() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
    public Peca getPeca() { return peca; }
    public void setPeca(Peca peca) { this.peca = peca; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
}