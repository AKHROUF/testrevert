package dz.etm.formation.model;

public class Carre extends FormeGeometrique {

    int longueur;

    public Carre(){

    }

    public Carre(Point origine, String nom, int longueur){
        // appel implicite à super()
        setOrigine(origine);
        setNom(nom);
        setLongueur(longueur);
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = Math.abs(longueur);
    }

    @Override
    public double superficie() {
        return longueur * longueur;
    }
}
