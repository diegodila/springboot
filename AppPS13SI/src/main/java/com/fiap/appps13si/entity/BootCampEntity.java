package com.fiap.appps13si.entity;

import javax.persistence.*;

@Table(name = "BOOT_CAMP_ENTITY")
@Entity
public class BootCampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String especialidade;
    private double duracao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duração) {
        this.duracao = duração;
    }
}