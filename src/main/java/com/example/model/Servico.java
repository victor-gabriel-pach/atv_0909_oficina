package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Servico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;

    @OneToMany(mappedBy = "servico")
    private List<ItemServico> itensServico;

    public Servico() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public List<ItemServico> getItensServico() { return itensServico; }
    public void setItensServico(List<ItemServico> itensServico) { this.itensServico = itensServico; }
}