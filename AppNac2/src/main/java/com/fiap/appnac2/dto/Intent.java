package com.fiap.appnac2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Intent implements Serializable {

    private static final long serialVersionUID = 1L;
    Long id;

    @NotBlank(message = "Informe seu Nome")
    private String name;

    @NotBlank(message = "Informe seu endereço")
    private String adress;

    @NotBlank(message = "Informe o numero da sua casa")
    private String number;

    @NotBlank(message = "Informe sua cidade")
    private String city;

    @NotBlank(message = "Informe seu estado")
    private String state;

    @NotBlank(message = "Informe seu CEP.")
    private String cep;

    @NotBlank(message = "Informe seu email")
    private String email;

    @NotBlank(message = "Informe seu telefone")
    private String contact;

    @NotBlank(message = "Informe seu CPF.")
    private String socialNumber;

    @NotBlank(message = "Informe seu RG.")
    private String generalNumber;

    @NotBlank(message = "Informe a data de nascimento.")
    private String birthDate;

    @NotBlank(message = "Informe a categoria de financiamento")
    private String category;

    @NotNull(message = "Informe a sua intenção de financiamento.")
    private double intentValue;
    @NotNull(message = "Informe a quantidade de parcelas")
    private int quantity;
    @NotNull(message = "Informe seu salario")
    private double salary;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getGeneralNumber() {
        return generalNumber;
    }

    public void setGeneralNumber(String generalNumber) {
        this.generalNumber = generalNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getIntentValue() {
        return intentValue;
    }

    public void setIntentValue(double intentValue) {
        this.intentValue = intentValue;
    }

}
