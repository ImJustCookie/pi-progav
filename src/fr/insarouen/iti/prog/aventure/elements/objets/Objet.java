package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.Entite;

public abstract class Objet extends Entite {
    

    public Objet(String nom, Monde monde){
        super(nom, monde);
    }

    public boolean estDeplacable(){
        return false;
    }



}
