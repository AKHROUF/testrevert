package dz.etm.formation.model;

public abstract class FormeGeometrique {

    private Point origine= new Point(10,10);
    private String nom;

    public Point getOrigine() {
        return origine;
    }

    public void setOrigine(Point origine) {
        this.origine = origine;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double superficie();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj != null && obj instanceof FormeGeometrique) {
            FormeGeometrique other = (FormeGeometrique)obj;
            return this.superficie() == other.superficie();
        }

        return false;
    }
}
