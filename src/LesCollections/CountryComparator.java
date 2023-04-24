package LesCollections;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    private boolean ordre;

    public CountryComparator(boolean ordre) {
        this.ordre = ordre;
    }

    public int compare(Country c1, Country c2){
        if(ordre){
            return c1.getName().compareTo(c2.getName());
        } else{
            return c2.getName().compareTo(c1.getName());
        }
    }
}
