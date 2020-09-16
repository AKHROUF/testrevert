package dz.etm.formation.model;

public class Rectangle extends Carre {

    private int largeur;

    public Rectangle(){

    }

    /**
     *
     * @param origine
     * @param nom
     * @param longueur
     * @param largeur
     */
    public Rectangle(Point origine, String nom, int longueur, int largeur){
//        setOrigine(origine);
//        setNom(nom);
//        setLongueur(longueur);
        super(origine,nom,longueur);
        setLargeur(largeur);
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = Math.abs(largeur);
    }

    @Override
    public double superficie() {
        return longueur * largeur;
    }
}
