import com.jameroraclecursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.jameroraclecursos.screenmatch.calculos.FiltroRecomendacion;
import com.jameroraclecursos.screenmatch.modelos.Episodio;
import com.jameroraclecursos.screenmatch.modelos.Pelicula;
import com.jameroraclecursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        // Crear un objeto de la clase Película
        Pelicula miPelicula = new Pelicula();
            miPelicula.setNombre("Encanto");
            miPelicula.setFechaDeLanzamiento(2021);
            miPelicula.setDuracionEnMinutos(120);
            miPelicula.setIncluidoEnElPlan(true);

            // Mostrar los valores de los atributos
            miPelicula.muestraFichaTecnica();
            miPelicula.evalua(10);
            miPelicula.evalua(10);

        // Obtener los valores de los atributos
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de las evaluaciones: " + miPelicula.calculaMedia());

        // Crear un objeto de la clase Película
        Serie casaDelDragon = new Serie();
            casaDelDragon.setNombre("La casa del Dragón");
            casaDelDragon.setFechaDeLanzamiento(2022);
            casaDelDragon.setTemporadas(1);
            casaDelDragon.setMinutosPorEpisodio(50);
            casaDelDragon.setEpisodiosPorTemporada(10);
            casaDelDragon.muestraFichaTecnica();

        System.out.println("Duración en minutos: " + casaDelDragon.getDuracionEnMinutos());

        // Crear otro objeto de la clase Película
        Pelicula otraPelicula =new Pelicula();
            otraPelicula.setNombre("Matrix");
            otraPelicula.setFechaDeLanzamiento(1998);
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
        var peliculaBruno = new Pelicula();
        peliculaBruno.setNombre("El Señor de los Anillos");
        peliculaBruno.setDuracionEnMinutos(180);
        peliculaBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePelículas = new ArrayList<>();
        listaDePelículas.add(peliculaBruno);
        listaDePelículas.add(miPelicula);
        listaDePelículas.add(otraPelicula);


        System.out.println("Tamaño de la lista: " + listaDePelículas.size());
        System.out.println("La primera película es: " + listaDePelículas.get(0).getNombre());
        System.out.println(listaDePelículas);

    }
}

