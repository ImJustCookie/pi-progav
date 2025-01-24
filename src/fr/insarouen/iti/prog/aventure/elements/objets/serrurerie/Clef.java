package fr.insarouen.iti.prog.aventure.elements.objets.serrurerie;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.objets.Objet;

public class Clef extends Objet{
    private Serrure serrure;

    public Clef(Monde monde){
        super("", monde);
        this.serrure = new Serrure(monde);
    }
    
    public Clef(String nom, Monde monde,Serrure serrure){
        super(nom, monde);
        this.serrure = serrure;
    }

}