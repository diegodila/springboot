package com.five.app05.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_convidados")
public class ConvidadosEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String email;
    private String acompanhantes;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(String acompanhantes) {
        this.acompanhantes = acompanhantes;
    }
}
