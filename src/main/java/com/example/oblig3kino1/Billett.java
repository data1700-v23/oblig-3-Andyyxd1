package com.example.oblig3kino1;

public class Billett {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private int telefon;
    private String epostadresse;

    public Billett(String film, int antall, String fornavn, String etternavn, int telefon, String epostadresse) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.epostadresse = epostadresse;
    }

    public Billett() {

    }

    public String getFilm() {
        return film;
    }

    public int getAntall() {
        return antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEpostadresse() {
        return epostadresse;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void setEpostadresse(String epostadresse) {
        this.epostadresse = epostadresse;
    }
}
