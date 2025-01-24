package fr.insarouen.iti.prog.aventure.elements.objets.serrurerie;

import fr.insarouen.iti.prog.aventure.Monde;

public class Clef extends Objet{
    private Serrure serrure;

    public Clef(Monde monde){
        Clef("", monde, new Serrure(monde));
    }
    
    public Clef(String nom, Monde monde,Serrure serrure){
        super(nom, monde);
        this.serrure = serrure;
    }

}