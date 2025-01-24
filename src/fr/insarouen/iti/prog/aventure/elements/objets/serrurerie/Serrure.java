package fr.insarouen.iti.prog.aventure.elements.objets.serrurerie;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.Entite;
import fr.insarouen.iti.prog.aventure.elements.Activable;

public class Serrure extends Entite implements Activable{
    private Monde monde;
    private String nom;

    public Serrure(Monde monde){
        Serrure("", monde);
    }
    public Serrure(String nom, Monde monde){
        super(nom, monde);
    }

    public Clef creerClef(){
        return Clef("", this.monde, this);
    }
    
}
