package fr.insarouen.iti.prog.aventure;

import fr.insarouen.iti.prog.aventure.elements.Entite;

public class Monde {
    final private String nom ;
    private Entite[] entityList;


    public Monde(String nom){
        this.nom = nom;
        this.entityList =new Entite[0];
    }

    public String getNom(){
        return this.nom;
    }

    public Entite[] getEntite(){
        return this.entityList;
    }

    public void ajouter(Entite entite){
        int length = this.entityList.length;
        Entite[] temp = new Entite[ this.entityList.length +1]; 

        System.arraycopy(this.entityList, 0, temp, 0, length);

        temp[length] = entite;

        this.entityList = temp;

    }

    @Override
    public String toString(){
        String temp;
        temp = this.nom+ " :";
        for (Entite entite : this.entityList) {
            temp += entite.toString() + ", ";
        }

        return temp;
    }

    
}
