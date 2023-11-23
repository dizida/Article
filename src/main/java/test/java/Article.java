package test.java;

public abstract class Article {
    
    private int reference;
    private String designation;
    private int prix;

    public Article(int reference, String designation, int prix){
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article [reference=" + reference + ", designation=" + designation + ", prix=" + prix + "]";
    }

    
}
