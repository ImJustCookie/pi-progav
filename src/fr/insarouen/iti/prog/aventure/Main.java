package fr.insarouen.iti.prog.aventure;

import fr.insarouen.iti.prog.aventure.elements.Entite;



public class Main{

    public static void main(String[] args) {
        
        Monde monde = new Monde("mondetoto");
        Entite toto = new Entite("toto",monde);
        Entite tata = new Entite("tata", monde);
        Entite titi = new Entite("toto", monde);

        System.out.println(toto.equals(toto));
        System.out.println(toto.equals(tata));
        System.out.println(toto.equals(titi));
        
        
    }
}