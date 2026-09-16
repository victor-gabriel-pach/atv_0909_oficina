package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Veiculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private Integer anoModelo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL)
    private List<OrdemServico> ordensServico;

    public Veiculo() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Integer getAnoModelo() { return anoModelo; }
    public void setAnoModelo(Integer anoModelo) { this.anoModelo = anoModelo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<OrdemServico> getOrdensServico() { return ordensServico; }
    public void setOrdensServico(List<OrdemServico> ordensServico) { this.ordensServico = ordensServico; }
}