package fr.insarouen.iti.prog.aventure.elements;

import fr.insarouen.iti.prog.aventure.Monde;

public class Entite {
    final private String nom;
    private Monde monde;


    public Entite(String nom,Monde monde){
        this.nom = nom;
        this.monde = monde;
        monde.ajouter(this);
    }
    
    public String getNom(){
        return this.nom;
    }

    public Monde getMonde(){
        return this.monde;
    }

    @Override
    public String toString(){
        return getNom();
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null || object.getClass() != this.getClass()){
            return false;
        }
        Entite temp = (Entite) object;
        return (temp.nom == this.nom && temp.monde == this.monde); 
    }
    

}