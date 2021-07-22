package com.fiap.app08_1.entity;

import com.fiap.app08_1.dto.CarroDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Table(name = "carro")
@Entity
public class Carro {

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

    public CarroDto fromTo(){
        CarroDto carroDto = new CarroDto();
        carroDto.setId(this.id);
        carroDto.setModelo(this.modelo);
        carroDto.setAno(this.ano);
        carroDto.setCor(this.cor);
        return carroDto;
    }

}