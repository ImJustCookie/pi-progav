package fr.insarouen.iti.prog.aventure.elements.objets;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.Executable;

public class Torche extends Objet implements Executable{

    public Torche(String nom, Monde monde){
        super(nom, monde);
    }

    @Override
    public boolean estDeplacable(){
        return true;
    }

    public void executer(){
        
    }
}