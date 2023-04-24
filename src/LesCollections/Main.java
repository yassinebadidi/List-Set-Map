package LesCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country("France"));
        countries.add(new Country("USA"));
        countries.add(new Country("Espagne"));
        countries.add(new Country("Allemagne"));
        countries.add(new Country("Maroc"));
        countries.add(new Country("Brésile"));

        System.out.println("La collection créée contient "+ countries.size()+" pays !");

        //Cette méthode ne marchera pas puisque countries sont des objet et pas des string
        //Il faut alors implémenté les comparateur voulu
        //Collections.sort(countries);

        boolean sensdetrie = true; // true pour croissant et false pour décrissant
        Collections.sort(countries, new CountryComparator(sensdetrie));
        System.out.println("Pays trier par ordre alphabétique :");
        // Affichage
        if(countries.isEmpty()){
            System.out.println("Liste Vide");
        } else {
            for (Country country : countries) {
                System.out.println(country.getName());
            }
        }

        // Trie par longueur du nom du pays :
        Collections.sort(countries,new CountryLenghthComparator());
        System.out.println("Pays trier par longeur du nom :");
        //Affichage
        if(countries.isEmpty()){
            System.out.println("Liste Vide");
        } else {
            for (Country country : countries) {
                System.out.println(country.getName());
            }
        }


        //countries.clear();





    }
}