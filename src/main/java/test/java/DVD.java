package test.java;

public class DVD extends Article{
    private String realisateur;
    private double duree;

    public DVD(int reference, String designation, int prix, String realisateur, double duree) {
        super(reference, designation, prix);
        this.realisateur = realisateur;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "DVD [auteur=" + realisateur + ", duree=" + duree + "]";
    }

    

    
}
