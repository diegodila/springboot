package com.fiap.appnac2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Intent implements Serializable {

    private static final long serialVersionUID = 1L;
    Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String adress;
    @NotBlank
    private String number;
    @NotBlank
    private String city;
    @NotBlank
    private String state;
    @NotBlank
    private String cep;
    @NotBlank
    private String email;
    @NotBlank
    private String contact;
    @NotBlank
    private String socialNumber;
    @NotBlank
    private String generalNumber;
    @NotBlank
    private String birthDate;
    @NotBlank
    private String category;
    @NotNull
    private double intentValue;
    @NotNull
    private int quantity;
    @NotNull
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
