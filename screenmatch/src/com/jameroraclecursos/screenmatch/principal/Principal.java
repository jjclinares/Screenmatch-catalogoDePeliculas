package com.jameroraclecursos.screenmatch.principal;

import com.jameroraclecursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.jameroraclecursos.screenmatch.calculos.FiltroRecomendacion;
import com.jameroraclecursos.screenmatch.modelos.Episodio;
import com.jameroraclecursos.screenmatch.modelos.Pelicula;
import com.jameroraclecursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        // Crear un objeto de la clase Película
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
            miPelicula.setDuracionEnMinutos(120);

        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

            // Evaluaciónes de Pelicula y Media
            miPelicula.muestraFichaTecnica();
            miPelicula.evalua(8);
            miPelicula.evalua(5);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de las evaluaciones: " + miPelicula.calculaMedia());

        // Crear un objeto de la clase Serie
        Serie casaDelDragon = new Serie("La casa del Dragón",2022);
            casaDelDragon.setTemporadas(1);
            casaDelDragon.setMinutosPorEpisodio(50);
            casaDelDragon.setEpisodiosPorTemporada(10);
            casaDelDragon.muestraFichaTecnica();
        System.out.println("Duración en minutos: " + casaDelDragon.getDuracionEnMinutos());

        // Crear otro objeto de la clase Película
        Pelicula otraPelicula =new Pelicula("Matrix",1998);
            otraPelicula.setDuracionEnMinutos(180);
            otraPelicula.muestraFichaTecnica();

        //Calcular tiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDelDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para disfrutar todos los titulos= " + calculadora.getTiempoTotal() +"Minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio =new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDelDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);

        // Usando var para inferir el tipo de dato
        var peliculaBruno = new Pelicula("El Señor de los Anillos",2001);
        peliculaBruno.setDuracionEnMinutos(180);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);


        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
    }
}

