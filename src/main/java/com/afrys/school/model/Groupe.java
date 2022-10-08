package com.afrys.school.model;

import java.util.List;

public class Groupe {
private String nom;
private static int nombreMax;
private List<Eleve> eleves;

    @Override
    public String toString() {
        return "Groupe{" +
                "nom='" + nom + '\'' +
                ", eleves=" + eleves +
                '}';
    }

    public Groupe(String nom, List<Eleve> eleves) {
        this.nom = nom;
        this.eleves = eleves;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static void setNombreMax(int nombreMax) {
        Groupe.nombreMax = nombreMax;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }

    public String getNom() {
        return nom;
    }

    public static int getNombreMax() {
        return nombreMax;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }
}

