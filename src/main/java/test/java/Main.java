package test.java;

public class Main {
    
    public static void main(String[] args) {
        /*Article livre1 = new Livre(001, null, 13, 040, 400, "Maupassant");
        System.out.println(livre1);

        Article dvd1 = new DVD(002, null, 10, "gilman", 3);
        System.out.println(dvd1);
        DVD dvd2 = new DVD(003, null, 10, "jul", 3);
        System.out.println(dvd2);
        Livre livre2 = new Livre(004, null, 15, 045, 300, "Victor Hugo");
        System.out.println(livre2);*/

        Magasin magasin1 = new Magasin();
        System.out.println(magasin1);
        magasin1.getAuteur();
        magasin1.getRealisateur();
    }

}
