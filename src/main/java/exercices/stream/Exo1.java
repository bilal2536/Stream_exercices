package exercices.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez la méthode mapToUppercaseWithStream afin d'avoir
 * le même comportement que mapToUppercase
 *************
 *
 * Resultat attendu : [AARON, FRANK, WILLIAM, GILLIAM]
 */
class Exo1 {

    public static void main(String[] args) {
        Collection<String> result = mapToUppercase("aaron", "frank", "william", "gilliam");
        System.out.println(result);
    }

    public static Collection<String> mapToUppercase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUppercaseWithStream(String... names) {
        return Arrays.stream(names) // Conversion de la collection en Stream
                .map(String::toUpperCase) // Conversion de chaque élément en majuscules
                .collect(toList()); // Collecte des resultats dans une nouvelle liste
    }

}
