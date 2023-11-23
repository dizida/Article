package test.java;
import java.util.ArrayList;
public class Magasin {

    private ArrayList<Article> listeArticle;
    
    public Magasin(){

        Article livre1 = new Livre(004, null, 15, 045, 300, "Victor Hugo");
        Article livre2 = new Livre(005, null, 15, 047, 300, "Guy");
        Article livre3 = new Livre(006, null, 15, 030, 300, "Baudelaire");
        Article livre4 = new Livre(007, null, 15, 032, 300, "Zola");
        Article livre5 = new Livre(025, null, 15, 050, 300, "Maupassant");
        Article dvd1 = new DVD(026, null, 10, "jul", 3);
        Article dvd2 = new DVD(010, null, 10, "Adele", 3);
        Article dvd3 = new DVD(010, null, 10, "teams", 3);
        Article dvd4 = new DVD(010, null, 10, "queen", 3);

        this.listeArticle = new ArrayList<>();

        listeArticle.add(livre1);
        listeArticle.add(livre2);
        listeArticle.add(livre3);
        listeArticle.add(livre4);
        listeArticle.add(livre5);
        listeArticle.add(dvd1);
        listeArticle.add(dvd2);
        listeArticle.add(dvd3);
        listeArticle.add(dvd4);
        
    }

    @Override
    public String toString() {
        return "Magasin [listeArticle=" + listeArticle + "]" + "\n" ;
    }

    public void getAuteur(){
        for(Article a : listeArticle){

            if(a instanceof Livre){
                System.out.println(a);
            }
        }
    }

    public void getRealisateur(){
        for(Article a : listeArticle){

            if(a instanceof DVD){
                System.out.println(a);
            }
        }
    }
    
}
