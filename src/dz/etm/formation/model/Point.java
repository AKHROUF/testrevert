 package dz.etm.formation.model;

import java.util.Objects;

/**
 * Représente un point dans un <b>axe orthogonal</b>
 */
//1. création de la classe en indiquant le package
public class Point extends Object {

    public static String COULEUR;

    //2. déclaration des attributs
    private int x;//=5
    private int y;//=5

    public static String inverser(String in){
        return in.trim();
    }

    //5. génération des constructeurs
    public Point(){
        //x = y = 5;
        //deplacer(5,5);
        this(5,5);
    }
    public Point(int x, int y){
        deplacer(x, y);
    }

    //3. génération des accesseurs

    /**
     * retourne l'abscisse du  point
     * @return l'abscisse du point
     */
    public int getX(){
        return x;
    }

    /**
     * change l'abscisse du point
     * @param a nouvelle abscisse. Doit être  >= 0
     * @throws RuntimeException si a < 0
     */
    public void setX(int a) throws RuntimeException {
        if (a >= 0)
            x=a;
        //else ;
        //else x=0;
        //else throw new Exception("X doit être positif ou nul");
        else throw new RuntimeException("X doit être positif ou nul");
    }
    public int getY(){
        return y;
    }
    public void setY(int a){
        if (a >= 0)
            y=a;
    }

    //4. implémentation des méthodes

    /**
     *  changer les coordonnées du point
     * @param a nouvelle abscisse
     * @param b nouvelle ordonnée
     */
    public void deplacer(int a, int b) {
        //x=a;y=b; problème si "a" ou "b" < 0
        setX(a);
        setY(b);
    }

    /**
     * changer les coordonnées du point
     * @param other point de référence
     */
    public void deplacer(Point other){
//        setX(other.x);
//        setY(other.y);
        deplacer(other.x, other.y);
    }

    public void afficher (){
        System.out.println("("+x+";"+y+")");
    }

    //6.redéfinition des méthodes de la classe Object

    /**
     * vérifier si les 2 points ont les memes coordonnées
     * @param other
     * @return true s'ils ont la même valeur de l'abcisse et la
     * même valeur de l'ordonnét
     */
    //@Override
    public boolean equals(Point other) {
        //return (x == other.x && y == other.y);
        return (this.x == other.x && this.y == other.y);
    }

    @Override
    public String toString() {
        return "["+x+"-"+y+"]";
    }
}
