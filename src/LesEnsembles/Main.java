package LesEnsembles;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String setAsString;

        Set<String> colors = new HashSet<>(Arrays.asList("Rouge", "Cyan", "Bleu", "Vert"));
        setAsString = Arrays.toString(colors.toArray());
        System.out.println("Initialialisation de la HashSet colors : "+setAsString);

        // Suppression de la couleur Rouge :
        colors.remove("Rouge");
        setAsString = Arrays.toString(colors.toArray());
        System.out.println("HashSet colors après suppression de la couleur Rouge : "+setAsString);

        //Ajouter un ensemble de couleur :
        Set<String> others = new HashSet<>(Arrays.asList("Jaune","Magenta"));
        colors.addAll(others);
        setAsString = Arrays.toString(colors.toArray());
        System.out.println("HashSet colors après ajout de la 2nd Hashset(others) : "+setAsString);

        //Supprimer un élément spécifique s'il existe :
        boolean supprime = colors.remove("Rouge");
        setAsString = Arrays.toString(colors.toArray());
        if(supprime){
            System.out.println("La couleur à été supprimé. Hashset après suppression : "+setAsString);
        }else {
            System.out.println("La couleur n'a pas été trouver dans l'ensemble colors. Hashet reste le même : "+ setAsString);
        }

        //Supprimer les élément de l'ensemble others
        colors.removeAll(others);
        setAsString = Arrays.toString(others.toArray());
        System.out.println("HashSet colors après suppression de tous éléments contenus dans others :"+ setAsString);

        //Suppression des éléments de others
        others.removeAll(others);
        setAsString = Arrays.toString(others.toArray());
        System.out.println("HashSet others après avoir vidé les éléments :"+ setAsString);

        //Suppression des éléments de colors
        colors.removeAll(colors);
        setAsString = Arrays.toString(others.toArray());
        System.out.println("HashSet others après avoir vidé les éléments :"+ setAsString);
    }
}