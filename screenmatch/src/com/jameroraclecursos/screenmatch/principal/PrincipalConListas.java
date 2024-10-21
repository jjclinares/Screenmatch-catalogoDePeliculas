package com.jameroraclecursos.screenmatch.principal;

import com.jameroraclecursos.screenmatch.modelos.Pelicula;
import com.jameroraclecursos.screenmatch.modelos.Serie;
import com.jameroraclecursos.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        miPelicula.evalua(6);
        var peliculaBruno = new Pelicula("El Señor de los Anillos", 2001);
        miPelicula.evalua(10);
        Serie casaDelDragon = new Serie("La casa del Dragón", 2022);
        miPelicula.evalua(9);

        Pelicula p1 = miPelicula;

        List<Titulo> lista = new LinkedList<>();
        lista.add(peliculaBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDelDragon);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);

        ArrayList<String> listaDeArtistas  = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada:" + listaDeArtistas);


        // Iteración de la lista para Java 1.5
//        for (Titulo item: lista){
//            System.out.println(item.getNombre());
        //Condicion de instancia antes de Java 14
//            if (item instanceof Pelicula){
//                Pelicula pelicula = (Pelicula) item;
//                System.out.println(pelicula.getClasificacion());
//        // Iteración de la lista para Java 8
//        //lista.forEach(item -> System.out.println(item.toString()));
//        //}
//
//
//            }
//        }
        //Condicion de instancia Despues de Java 14

    }
}
