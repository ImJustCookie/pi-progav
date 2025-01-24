package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;

public class PiedDeBiche extends Objet {
    
    public PiedDeBiche(Monde monde, String nom){
        super(nom, monde);
    }
    
    @Override
    public boolean estDeplacable(){
        return false;
    }
}
