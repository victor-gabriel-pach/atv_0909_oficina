package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class NotaFiscal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 20)
    private String numero;
    
    @Column(length = 44)
    private String chaveAcesso;
    
    private LocalDate dataEmissao;
    private Double valorImposto;

    @OneToOne
    @JoinColumn(name = "ordem_id")
    private OrdemServico ordemServico;

    public NotaFiscal() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getChaveAcesso() { return chaveAcesso; }
    public void setChaveAcesso(String chaveAcesso) { this.chaveAcesso = chaveAcesso; }
    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }
    public Double getValorImposto() { return valorImposto; }
    public void setValorImposto(Double valorImposto) { this.valorImposto = valorImposto; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
}