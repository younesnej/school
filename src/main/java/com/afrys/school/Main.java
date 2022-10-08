package com.afrys.school;

import com.afrys.school.model.Eleve;

public class Main {
    public static void main(String[] args) {
        Eleve eleve1 = new Eleve("nejeoui","younes","beni mellal", "0660621690", "cne1");

        System.out.println("Hello world!" );
        System.out.println("nom "+eleve1.getNom());
        System.out.println("prenom "+eleve1.getPrenom());
        System.out.println("address "+eleve1.getAdresse());
        System.out.println("tel "+eleve1.getTelephone());

        eleve1.setAdresse("Marakech");
        eleve1.setTelephone("0614013999");

        System.out.println("Hello world!" );
        System.out.println("nom "+eleve1.getNom());
        System.out.println("prenom "+eleve1.getPrenom());
        System.out.println("address "+eleve1.getAdresse());
        System.out.println("tel "+eleve1.getTelephone());

        Eleve eleve2 = new Eleve();
        eleve2.setNom("nejeoui");
        eleve2.setPrenom("roa");
        eleve2.setAdresse("rabat");
        eleve2.setTelephone("06343421");
        System.out.println("Hello world!" );
        System.out.println("nom "+eleve2.getNom());
        System.out.println("prenom "+eleve2.getPrenom());
        System.out.println("address "+eleve2.getAdresse());
        System.out.println("tel "+eleve2.getTelephone());

        Eleve eleve3 = new Eleve();
        eleve3.setNom("nejeoui");
        eleve3.setPrenom("soulaiman");
        eleve3.setAdresse("acila");
        eleve3.setTelephone("06785419");
        System.out.println(eleve3.toString());
    }
}