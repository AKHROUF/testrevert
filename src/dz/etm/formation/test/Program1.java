package dz.etm.formation.test;

import dz.etm.formation.model.*;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program1 {

    public static void main(String[] args) {
//        int x;
//
//        float y = x*2;
//        System.out.println(x);
        Point p = new Point();
        p.afficher();

        p.setX(10);
        p.setY(15);
        p.afficher();

        p.deplacer(20,25);
        p.afficher();

        Point q = new Point(30,35);
        q.afficher();

        q.deplacer(p);
        q.afficher();

        System.out.println("p = q ? " + (p==q));
        System.out.println("p equals q ? "+(p.equals(q)));// à l'intérieur de equals : this=p ; other=q

        Point r = p;

        r.deplacer(40,45);
        p.afficher();

        System.out.println(p);

        q.setX(99);
        q.equals(r);// à l'intérieur de equals : this=q ; other=r

//        FormeGeometrique fg = new FormeGeometrique();
//        fg.superficie();

        Point.inverser("java 14");
        Point.COULEUR="rouge";
        //...
        Point.COULEUR="vert";
        System.out.println(p.COULEUR);

        // 1. créer un carré
        Carre c = new Carre();

        // 2. nommer le carré c1
        c.setNom("c1");

        // 3. fixer sa longueur à 33
        c.setLongueur(33);

        // 4. afficher la superficie du carré
        System.out.println(c.superficie());

        // 5. déplacer l'origine du carré à (22,22)
        c.setOrigine(null);
        if(c.getOrigine() != null)
        c.getOrigine().deplacer(22,22);
        else System.out.println("le carré n'a pas d'origine. ");
        //c.setOrigine( new Point(22,22) );

        Rectangle r1 = new Rectangle(p,"r1",20,10);

        Rectangle r2 = new Rectangle(new Point(11,11),"r2",20,10);

        int i =0;
        //int j = 10/i;

        try {
            FileReader f = new FileReader("ss.txt");
        } catch (FileNotFoundException e) {
            System.out.println("le fichier n'existe pas");;
        }

        int[] t = new int[]{1,3,5,7};

        Point[] tab = new Point[10];
        Point tab2[] = new Point[10];

        Carre[] carres = new Carre[4];
        carres[0]=c;
        carres[1]=r1;

        //carres[1].getLargeur();
        System.out.println("r1 : " + carres[1].superficie());

        FormeGeometrique[] fgs = new FormeGeometrique[5];
        fgs[0]= new Carre(null,null,20);
        fgs[1]=new Rectangle(null,null,20,10);
        fgs[2]=new Cube(null,null,20);
        fgs[3]=new Cercle(null,null,20);
        fgs[4]=new Sphere(null,null,20);

        System.out.println("----------------------");
        for (FormeGeometrique forme: fgs) {
            System.out.println(forme.superficie());
        }
    }

}
