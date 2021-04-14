package com.example.MisriahArmory.models;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
abstract class WeaponCharacteristics {
    @Id
    @GeneratedValue
    private int id;

    private String ammoType;
    private String gunName;
    private Date dateMade;
    private String gunImage;
    private String modelSeries;
    private String gunType;
    private String feedSystem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    public String getGunImage() {
        return gunImage;
    }

    public void setGunImage(String gunImage) {
        this.gunImage = gunImage;
    }

    public String getModelSeries() {
        return modelSeries;
    }

    public void setModelSeries(String modelSeries) {
        this.modelSeries = modelSeries;
    }

    public String getGunType() {
        return gunType;
    }

    public void setGunType(String gunType) {
        this.gunType = gunType;
    }

    public String getFeedSystem() {
        return feedSystem;
    }

    public void setFeedSystem(String feedSystem) {
        this.feedSystem = feedSystem;
    }

    @Override
    public String toString() {
        return "WeaponCharacteristics{" +
                "id=" + id +
                ", ammoType='" + ammoType + '\'' +
                ", gunName='" + gunName + '\'' +
                ", dateMade=" + dateMade +
                ", gunImage='" + gunImage + '\'' +
                ", modelSeries='" + modelSeries + '\'' +
                ", gunType='" + gunType + '\'' +
                ", feedSystem='" + feedSystem + '\'' +
                '}';
    }
}
