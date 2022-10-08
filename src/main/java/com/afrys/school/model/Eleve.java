package com.afrys.school.model;

public class Eleve extends Person {
    private String cne;

    public Eleve(String nom, String prenom, String adresse, String telephone, String cne) {
        super(nom, prenom, adresse, telephone);
        this.cne = cne;
    }

    public Eleve(){

    }
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public String toString() {
        return "Eleve{" +super.toString()+
                "cne='" + cne + '\'' +
                '}';
    }
}
