package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Mecanico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany(mappedBy = "mecanicos")
    private List<OrdemServico> ordensServico;

    public Mecanico() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<OrdemServico> getOrdensServico() { return ordensServico; }
    public void setOrdensServico(List<OrdemServico> ordensServico) { this.ordensServico = ordensServico; }
}