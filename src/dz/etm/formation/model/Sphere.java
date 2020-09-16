package dz.etm.formation.model;

public class Sphere extends Cercle{

    public Sphere(){
   }

    public Sphere(Point origine, String nom, int rayon){
        super(origine, nom, rayon);
    }

    @Override
    public double superficie() {
        return super.superficie() * 4;
    }

    public double volume(){
        return 4/3 * Math.PI * Math.pow(rayon,3);
    }
}
