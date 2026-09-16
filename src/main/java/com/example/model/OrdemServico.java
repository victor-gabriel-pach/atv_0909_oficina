package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class OrdemServico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataEmissao;
    private Double valorTotal;

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToMany
    @JoinTable(name = "ordem_mecanico",
        joinColumns = @JoinColumn(name = "ordem_id"),
        inverseJoinColumns = @JoinColumn(name = "mecanico_id"))
    private List<Mecanico> mecanicos;

    @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.ALL)
    private List<ItemServico> itensServico;

    @OneToMany(mappedBy = "ordemServico", cascade = CascadeType.ALL)
    private List<ItemPeca> itensPeca;

    @OneToOne(mappedBy = "ordemServico", cascade = CascadeType.ALL)
    private NotaFiscal notaFiscal;

    public OrdemServico() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(LocalDate dataEmissao) { this.dataEmissao = dataEmissao; }
    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public List<Mecanico> getMecanicos() { return mecanicos; }
    public void setMecanicos(List<Mecanico> mecanicos) { this.mecanicos = mecanicos; }
    public List<ItemServico> getItensServico() { return itensServico; }
    public void setItensServico(List<ItemServico> itensServico) { this.itensServico = itensServico; }
    public List<ItemPeca> getItensPeca() { return itensPeca; }
    public void setItensPeca(List<ItemPeca> itensPeca) { this.itensPeca = itensPeca; }
    public NotaFiscal getNotaFiscal() { return notaFiscal; }
    public void setNotaFiscal(NotaFiscal notaFiscal) { this.notaFiscal = notaFiscal; }
}