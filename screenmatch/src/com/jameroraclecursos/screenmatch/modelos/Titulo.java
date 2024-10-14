package com.jameroraclecursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    //Determinar Private (No se puede acceder directamente desde fuera de la clase)
    private String nombre;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;
    private int duracionEnMinutos;

    //Constructores

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    //Obtener valores de los atributos privados

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    //Establecer  valores a los atributos privados

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }




    //Imprimir los valores generales por película
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento fue : " + fechaDeLanzamiento);
        System.out.println("Duración en Minutos es: " + getDuracionEnMinutos());
    }


    //Sumar las notas en valor y cantidad
    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }


    // Calcular la media
    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}