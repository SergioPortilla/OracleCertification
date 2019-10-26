package java8.questions.certified.java813;

import java8.questions.certified.material.SgrOpcionMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class pruebaStream {

    public static String esto(){
        SgrOpcionMenu opcion1 = new SgrOpcionMenu();
        opcion1.setId(232L);
        opcion1.setPadre(null);
        opcion1.setCodigo("anything");
        opcion1.setNumeroModificaciones(2);
        opcion1.setUrl("some url here");
        SgrOpcionMenu opcion2 = new SgrOpcionMenu();
        opcion2.setId(2222L);
        opcion2.setPadre(opcion1);
        opcion2.setCodigo("anything");
        opcion2.setNumeroModificaciones(2);
        opcion2.setUrl("some url here");

        List<SgrOpcionMenu> list = new ArrayList<>();
        list.add(opcion1);
        list.add(opcion2);

        // Print the List
        System.out.println("List: " + list);

        // Create the predicate for item starting with G
        Predicate<SgrOpcionMenu> predicate = s -> s.getPadre() != null;


        // Convert List to stream
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
        return "";
    }

    public static String estootro(){
        List<String> list = Arrays.asList("GeeksForGeeks",
                "A computer portal",
                "for",
                "Geeks");

        // Print the List
        System.out.println("List: " + list);

        // Create the predicate for item starting with G
        Predicate<String> predicate = s ->  s.startsWith("G");

        System.out.println("Stream from List with items"+
                " starting with G: ");

        // Convert List to stream
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
        return "";
    }
}
