package com.example.MisriahArmory.models;

import javax.persistence.Entity;

@Entity
public class UNSCWeapon extends WeaponCharacteristics{

    private String affiliation;
    private String operation;
    private String manufacturer;

    public UNSCWeapon() {}

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
