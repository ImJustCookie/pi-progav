package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;

public class PiedDeBiche extends Objet {
    
    public PiedDeBiche(String nom, Monde monde){
        super(nom, monde);
    }
    
    @Override
    public boolean estDeplacable(){
        return true;
    }
}
