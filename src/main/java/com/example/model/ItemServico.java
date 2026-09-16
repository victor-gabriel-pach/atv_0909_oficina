package com.example.model;

import jakarta.persistence.*;

@Entity
public class ItemServico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private OrdemServico ordemServico;

    public ItemServico() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
}