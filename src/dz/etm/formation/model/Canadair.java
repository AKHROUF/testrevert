package dz.etm.formation.model;

public class Canadair extends Avion implements IBateau {

    private double reservoir;
    private int capacite;

    public double getReservoir() {
        return reservoir;
    }

    public void setReservoir(double reservoir) {
        this.reservoir = reservoir;
    }

    public void vider() {
        reservoir = 0 ;
    }

    @Override
    public int getCapacite() {
        return capacite;
    }

    @Override
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public void afficher() {
        System.out.println(capacite);
    }
}
