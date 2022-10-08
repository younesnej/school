package com.afrys.school.model;

public class Administrateur extends Person{
    @Override
    public String toString() {
        return "Administrateur{" +
                "telephoneTravail='" + telephoneTravail + '\'' +
                '}';
    }

    public Administrateur(String nom, String prenom, String adresse, String telephone, String telephoneTravail) {
        super(nom, prenom, adresse, telephone);
        this.telephoneTravail = telephoneTravail;
    }

    public Administrateur(String telephoneTravail) {
        this.telephoneTravail = telephoneTravail;
    }

    public void setTelephoneTravail(String telephoneTravail) {
        this.telephoneTravail = telephoneTravail;
    }

    public String getTelephoneTravail() {
        return telephoneTravail;
    }

    private String telephoneTravail;
}
