package com.fiap.appnac2.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Intent implements Serializable {

    private static final long serialVersionUID = 1L;
    Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String adress;
    @NotBlank
    private String contact;
    private String socialNumber;
    private String generalNumber;
    private String birthDate;
    private String category;
    private double intentValue;
    private int quantity;

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
