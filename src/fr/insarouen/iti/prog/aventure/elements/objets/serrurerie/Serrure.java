package fr.insarouen.iti.prog.aventure.elements.objets.serrurerie;

import fr.insarouen.iti.prog.aventure.Monde;
import fr.insarouen.iti.prog.aventure.elements.Activable;
import fr.insarouen.iti.prog.aventure.elements.Entite;
import fr.insarouen.iti.prog.aventure.elements.Etat;
import fr.insarouen.iti.prog.aventure.elements.objets.Objet;

public class Serrure extends Entite implements Activable{
    private Monde monde;
    private String nom;
    private Etat etat;

    public Serrure(String nom, Monde monde){
        super(nom, monde);
        this.etat = Etat.VERROUILLE;
    }

    public Serrure(Monde monde){
        super("", monde);
    }


    public Clef creerClef(){
        return new Clef("", this.monde, this);
    }

    @Override
    public void activer(){
        ///blablabla
    }

    @Override
    public void activerAvec(Objet objet){
        if (activableAvec(objet)){
            activer();
            
        }
    }

    @Override
    public Etat getEtat(){
        return this.etat;
    }

    @Override
    public boolean activableAvec(Objet objet){
        return objet instanceof Clef;
    }


}
