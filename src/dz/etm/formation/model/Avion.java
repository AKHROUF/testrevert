package dz.etm.formation.model;

public class Avion {

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int taille() {
        return nom.length();
    }
}
