package dz.etm.formation.model;

public class Bateau implements IBateau {

    private int capacite;

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
