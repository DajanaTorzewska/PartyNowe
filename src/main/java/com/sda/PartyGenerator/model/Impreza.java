package com.sda.PartyGenerator.model;

import java.util.Date;

public class Impreza {

    private final String nazwa;
    private final String adres;
    private final Date data;
    private final String dostep;
    private final String organizator;


    public Impreza(String nazwa, String adres, Date data, String dostep, String organizator){
        this.nazwa=nazwa;
        this.adres=adres;
        this.data=data;
        this.dostep=dostep;
        this.organizator=organizator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Date getData() {
        return data;
    }

    public String getAdres() {
        return adres;
    }

    public String getDostep() {
        return dostep;
    }

    public String getOrganizator() {
        return organizator;
    }
}
