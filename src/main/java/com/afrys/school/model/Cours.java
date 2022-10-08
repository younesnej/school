package com.afrys.school.model;

import java.util.List;

public class Cours {
    private String nom;
    private String langue;
    private List<Chapitre> chapitres;

    @Override
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", langue='" + langue + '\'' +
                ", chapitres=" + chapitres +
                '}';
    }

    public Cours(String nom, String langue, List<Chapitre> chapitres) {
        this.nom = nom;
        this.langue = langue;
        this.chapitres = chapitres;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setChapitres(List<Chapitre> chapitres) {
        this.chapitres = chapitres;
    }

    public String getNom() {
        return nom;
    }

    public String getLangue() {
        return langue;
    }

    public List<Chapitre> getChapitres() {
        return chapitres;
    }
}
