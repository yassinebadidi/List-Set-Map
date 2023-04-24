package LesCollections;

import java.util.Comparator;

public class CountryLenghthComparator implements Comparator<Country> {

    public int compare(Country c1, Country c2){
            return Integer.compare(c1.getName().length(),c2.getName().length());
    }
}
