package com.afrys.school.model;

public class Paragraphe {
    private String titre;
    private String contenu;

    @Override
    public String toString() {
        return "Paragraphe{" +
                "titre='" + titre + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }

    public Paragraphe(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }
}
