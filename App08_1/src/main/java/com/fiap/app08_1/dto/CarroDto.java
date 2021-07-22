package com.fiap.app08_1.dto;

import com.fiap.app08_1.entity.Carro;

import javax.persistence.Id;

public class CarroDto {
    @Id
    Long id;
    String modelo;
    String cor;
    String ano;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Carro fromto(){
        Carro carro = new Carro();
        carro.setId(this.id);
        carro.setModelo(this.modelo);
        carro.setCor(this.cor);
        carro.setAno(this.ano);
        return carro;
    }
}
