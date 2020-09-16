package dz.etm.formation.model;

public class Cube extends Carre {

    public Cube(){
   }

    public Cube(Point origine, String nom, int longueur){
        super(origine, nom, longueur);
    }
    @Override
    public double superficie() {
        //return longueur*longueur*6;
        return super.superficie() * 6;
    }

    public double volume(){
        return Math.pow(longueur,3);
    }
}
