package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.objets.serrurerie.Serrure;

public class Coffre extends Objet{
    private Objet[] listObjet;
    private Serrure serrure;

    public Coffre(String nom, Monde monde){
        super(nom, monde);
        this.serrure = new Serrure(this.getMonde());
    }

} 
