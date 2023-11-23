package test.java;

public class Livre extends Article{
    private int ISBN;
    private int nombreDePage;
    private String auteur;

    public Livre(int reference, String designation, int prix, int iSBN, int nombreDePage, String auteur) {

        super(reference, designation, prix);
        ISBN = iSBN;
        this.nombreDePage = nombreDePage;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre [ISBN=" + ISBN + ", nombreDePage=" + nombreDePage + ", auteur=" + auteur + "]";
    }

    

    
}
