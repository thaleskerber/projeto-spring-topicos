package br.gov.sp.fatec.springboot3topicos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cor_corpo")
public class Corpo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cor_id")
    private Long id;

    @Column(name = "cor_nome")
    private String nome;

    @Column(name = "cor_descricao")
    private String descricao;

    @Column(name = "cor_raio")
    public Integer raio;

    @Column(name = "cor_distancia_estrela")
    public Float distanciaEstrela;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRaio() {
        return raio;
    }

    public void setRaio(Integer raio) {
        this.raio = raio;
    }

    public Float getDistanciaEstrela() {
        return distanciaEstrela;
    }

    public void setDistanciaEstrela(Float distanciaEstrela) {
        this.distanciaEstrela = distanciaEstrela;
    }
}
