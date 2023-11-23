package test.java;

public class Auteur extends Personne{

    public Auteur(String nom, String prenom, String dateDeNaissance) {
        super(nom, prenom, dateDeNaissance);
        
    }

    @Override
    public String toString() {
        return "Auteur []";
    }

    
    
}
