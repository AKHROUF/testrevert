package dz.etm.formation.model;

public class Cercle extends FormeGeometrique {

    int rayon;

    public Cercle(){

    }

    public Cercle(Point origine, String nom, int rayon){
        // appel implicite à super()
        setOrigine(origine);
        setNom(nom);
        setRayon(rayon);
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = Math.abs(rayon);
    }

    @Override
    public double superficie() {
        return Math.PI * rayon * rayon;
    }
}
