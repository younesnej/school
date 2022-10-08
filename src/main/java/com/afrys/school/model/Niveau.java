package com.afrys.school.model;

import java.util.List;

public class Niveau {
private int nombreMAXParGroupe;
private String nom;

private  int prixScolarite;
private List<Cours> cours;

    @Override
    public String toString() {
        return "Niveau{" +
                "nombreMAXParGroupe=" + nombreMAXParGroupe +
                ", nom='" + nom + '\'' +
                ", cours=" + cours +
                '}';
    }

    public Niveau(int nombreMAXParGroupe, String nom, List<Cours> cours) {
        this.nombreMAXParGroupe = nombreMAXParGroupe;
        this.nom = nom;
        this.cours = cours;
    }

    public void setNombreMAXParGroupe(int nombreMAXParGroupe) {
        this.nombreMAXParGroupe = nombreMAXParGroupe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public int getNombreMAXParGroupe() {
        return nombreMAXParGroupe;
    }

    public String getNom() {
        return nom;
    }

    public List<Cours> getCours() {
        return cours;
    }
}
