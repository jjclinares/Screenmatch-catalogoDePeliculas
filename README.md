
## Requisitos

- **Java 8** o superior.
  
  #Objetivos: Implementar
              1.Programación orientada a objetos (OOP) implementado en java
              2.Manipulación de listas de objetos
              3.Consumo APIs de sistemas externos para cargar datos en formato JSON
              4.Manejo de excepciones
  
# Screenmatch - Catálogo de Películas 

Calculadora de Tiempo de Visualización con Recomendaciones, disfrutar de una lista de películas y series, así como para recomendar contenido en función de su popularidad.

Este proyecto en Java sigue un enfoque orientado a objetos (OOP) para calcular el tiempo total necesario para disfrutar de una lista de películas y series, así como para recomendar contenido en función de su popularidad. Utiliza una estructura modular que incluye clases y interfaces para maximizar la reutilización de código.

## Estructura del Proyecto

El código está organizado en los siguientes paquetes:

- **calculos**: Contiene la clase `CalculadoraDeTiempo` que suma las duraciones de películas y series, y la clase `FiltroRecomendacion` para filtrar contenido basado en popularidad.
- **modelos**: Incluye las clases `Pelicula`, `Serie`, `Episodio`, y la clase base `Titulo`, que manejan diferentes tipos de contenido.
- **interfaces**: La interfaz `Clasificacion` es implementada por las clases `Pelicula` y `Episodio` para definir un sistema de clasificación basado en visualizaciones o evaluaciones.

### Clases y Funcionalidades

- **Titulo**: Clase base para manejar atributos comunes como nombre, fecha de lanzamiento, duración y evaluaciones.
- **Pelicula**: Extiende `Titulo` y añade el atributo de director. Implementa `Clasificacion` para determinar la popularidad basada en las evaluaciones.
- **Serie**: Extiende `Titulo` y añade atributos específicos como temporadas, episodios y duración por episodio.
- **Episodio**: Clase que pertenece a una serie, con atributos adicionales como número de episodio y total de visualizaciones.
- **CalculadoraDeTiempo**: Suma las duraciones de las películas y series.
- **FiltroRecomendacion**: Filtra y clasifica contenido según su popularidad basada en visualizaciones o evaluaciones.

### Nuevas Funcionalidades

- **Sistema de clasificación**: Las películas y episodios ahora son evaluados y clasificados en función de sus evaluaciones o visualizaciones.
- **Recomendaciones de contenido**: La clase `FiltroRecomendacion` filtra los títulos, recomendando aquellos que son populares.

### Cómo ejecutar el programa

1. Asegúrate de tener Java instalado.
2. Compila y ejecuta el archivo `com.jameroraclecursos.screenmatch.principal.Principal.java`.
3. El programa mostrará los detalles de las películas y series, calculará el tiempo total de visualización, y ofrecerá recomendaciones basadas en la popularidad.

## Ejemplo de salida:

*El nombre de la película es: Encanto
Su fecha de lanzamiento fue : 2021
Duración en Minutos es: 120
Total de evaluaciones: 2
Media de las evaluaciones: 10.0
*El nombre de la Seríe es: La casa del Dragón
Su fecha de lanzamiento fue : 2022
Duración en Minutos es: 500
Duración en minutos: 500
*El nombre de la película es: Matrix
Su fecha de lanzamiento fue : 1998
Duración en Minutos es: 180
Tiempo necesario para disfrutar todos los títulos= 800Minutos
Muy popular 
Muy popular 
Tamaño de la lista: 3
La primera película es: El Señor de los Anillos
