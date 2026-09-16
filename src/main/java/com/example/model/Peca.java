package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Peca {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double precoUnitario;

    @OneToMany(mappedBy = "peca")
    private List<ItemPeca> itensPeca;

    public Peca() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(Double precoUnitario) { this.precoUnitario = precoUnitario; }
    public List<ItemPeca> getItensPeca() { return itensPeca; }
    public void setItensPeca(List<ItemPeca> itensPeca) { this.itensPeca = itensPeca; }
}