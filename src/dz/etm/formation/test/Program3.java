package dz.etm.formation.test;

import dz.etm.formation.model.*;
import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program3 {

    public static void main(String[] args) {
        List<FormeGeometrique> l1 = new ArrayList<>();
        l1.add(new Carre(null, "Carré 1", 10));
        l1.add(new Rectangle(null, "Rectangle 2",10, 5));
        l1.add(new Cube(null, "Cube 3", 10));
        l1.add(new Cercle(null, "Cercle 4", 10));
        l1.add(new Sphere(null,"Sphere 5", 10));

        l1.stream().sorted(Comparator.comparing(
                                FormeGeometrique::superficie));
        System.out.println("------------------------");
        List<FormeGeometrique> l2 =
                l1.stream().filter(x->x.getNom().startsWith("C"))
                        .collect(Collectors.toList());

        l1.stream().filter(x->x.getNom().startsWith("C"))
                .forEach(System.out::println);

        l1.stream().filter(x->x.getNom().startsWith("C"))
                //.map(x->x.getNom())
                .map(FormeGeometrique::getNom)
                .forEach(System.out::println);

        Stream<FormeGeometrique> l3 =
                l1.stream().filter(x->x.getNom().startsWith("C"));

//        Optional<FormeGeometrique> fg = l3.findFirst();
//        if (fg.isPresent())
//            System.out.println("1.Il existe au moins une forme");

        FormeGeometrique fg2 = l3.findFirst().orElse(null);
        if (fg2 != null)
            System.out.println("2.Il existe au moins une forme");

        //  distinct() : supprime les doublons
        //  limit(5) : récupérer 5 éléments seulement
        //  skip(10) : ignorer les 10 éléments

        System.out.println("moyenne = " +l1.stream().collect(
                Collectors.averagingDouble(FormeGeometrique::superficie)));
        System.out.println("somme = " +l1.stream().collect(
                Collectors.summingDouble(FormeGeometrique::superficie)));

        System.out.println("récap = " +l1.stream().collect(
                Collectors.summarizingDouble(FormeGeometrique::superficie)));

        // jointure
        // groupage

        Map<Boolean, List<FormeGeometrique>> l4 =
                l1.stream().collect(Collectors
                        .partitioningBy(x-> x instanceof Carre));

        System.out.println("les carrés");
        l4.get(true).forEach(x-> System.out.println(x));
        System.out.println("les non carrés");
        l4.get(false).forEach(System.out::println);
        System.out.println("-------------------------");
        String[] t1 = {"A", "B", "C"};
        String[] t2 = {"B", "C", "D"};


// INNER JOIN
        List<Pair<String,String>> list = Stream.of(t1)
                .flatMap(x -> Arrays.stream(t2).filter(y -> Objects.equals(x, y))  // t1 INNER JOIN t2 ON t1.e = t2.e
                .map(y -> new Pair<String,String>(x, y))
                ).collect(Collectors.toList());

// Print
        list.forEach(System.out::println);
l1.stream().sorted(Comparator.comparing(FormeGeometrique::superficie).thenComparing(FormeGeometrique::getNom));
    }
}
