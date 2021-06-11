package com.fiap.appps13si.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class BootCamp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @NotBlank(message = "Necessário informar o nome da bootcamp")
    private String name;
    @NotBlank(message = "Necessário informar a especialidade para cadastro")
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

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

}
