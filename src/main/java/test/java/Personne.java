package test.java;

public class Personne {
    
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    
    public Personne(String nom, String prenom, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + "]";
    }

    
}
