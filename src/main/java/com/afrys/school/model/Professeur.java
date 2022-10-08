package com.afrys.school.model;

public class Professeur extends Person {
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public String toString() {
        return "Professeur{" + super.toString()+
                "specialite='" + specialite + '\'' +
                '}';
    }

    public Professeur(String nom, String prenom, String adresse, String telephone, String specialite) {
        super(nom, prenom, adresse, telephone);
        this.specialite = specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
