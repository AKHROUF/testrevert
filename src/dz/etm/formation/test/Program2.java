package dz.etm.formation.test;

import dz.etm.formation.model.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program2 {

    public static void main(String[] args) {
        Set e1 = new HashSet();
        e1.add("java");
        e1.add(true);
        e1.add(3.14);
        e1.add('x');
        e1.add(-5);
        e1.add(new Point());
        e1.add(new Carre());

        for (Object o: e1) {
            System.out.println(o);
        }
        System.out.println("-----------------------");

        List<FormeGeometrique> l1 = new ArrayList<>();
        l1.add(new Carre(null, null, 10));
        l1.add(new Rectangle(null, null,10, 5));
        l1.add(new Cube(null, null, 10));
        l1.add(new Cercle(null, null, 10));
        l1.add(new Sphere(null,null, 10));
        //l1.add(5555);

        for (int i = 0; i < l1.size(); i++) {
//            Object o = l1.get(i);
//            if (o instanceof FormeGeometrique){
//                FormeGeometrique fg = (FormeGeometrique) o;
//                System.out.println(fg.superficie());
//            }
            System.out.println(l1.get(i).superficie());
        }
        // boolean byte short/char int long float double
        // Boolean Byte Short/Character Integer Long Float Double
        Integer i = 5;
        Integer j = new Integer(5);
        System.out.println(i==j);
        System.out.println(i.equals(j));

        List<Integer> liste;

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ar"));

        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(54,10,1); // 1/11/1954
        Date d3 = new Date(119,1,22); // 22/2/2019
        System.out.println(d3.getDate()+"/"+(d3.getMonth()+1)+"/"+(d3.getYear()+1900));
        System.out.println(format2.format(d3));

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        c.set(1962, 6, 5); // 5/7/62
        System.out.println(format1.format(c.getTime()));

        c.set(Calendar.YEAR, 2021);
        System.out.println(format2.format(c.getTime()));

        String[] jours = new String[] {"","Dimanche", "Lundi", "Mardi", "..."};
        int jour = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(jour + " " + jours[jour]);
    }
}
