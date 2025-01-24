package fr.insarouen.iti.prog.aventure.elements;

import fr.insarouen.iti.prog.aventure.elements.objets.Objet;

public interface Activable {
    public void activer();
    public void activerAvec(Objet objet);
    public Etat getEtat();
    public boolean activableAvec(Objet objet);
}
