package com.jameroraclecursos.screenmatch.calculos;

public class FiltroRecomendacion {
    private String recomendacion;
    
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy popular ");
        } else if (clasificacion.getClasificacion() >=2) {
            System.out.println("Popular");
        } else {
            System.out.println("Colocar en tu lista de reproducción");
        }
    }
}
