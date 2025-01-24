package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;

public class Coffre extends Objet{
    private Objet[] listObjet;
    private Serrure serrure;

    public Coffre(String nom, Monde monde){
        super(nom, monde);
    }
} 
