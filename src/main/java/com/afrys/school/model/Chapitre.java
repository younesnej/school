package com.afrys.school.model;

import java.util.List;

public class Chapitre {
    private String titre;
    private List<Paragraphe> paragraphes;

    @Override
    public String toString() {
        return "Chapitre{" +
                "titre='" + titre + '\'' +
                ", paragraphes=" + paragraphes +
                '}';
    }

    public Chapitre(String titre, List<Paragraphe> paragraphes) {
        this.titre = titre;
        this.paragraphes = paragraphes;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setParagraphes(List<Paragraphe> paragraphes) {
        this.paragraphes = paragraphes;
    }

    public String getTitre() {
        return titre;
    }

    public List<Paragraphe> getParagraphes() {
        return paragraphes;
    }
}
