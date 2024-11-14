# Patrón de Diseño: Iterator

Este proyecto demuestra la implementación del patrón de diseño **Iterator**. El patrón Iterator permite acceder secuencialmente a los elementos de una colección sin exponer su estructura interna, proporcionando una forma estándar de recorrer diferentes tipos de colecciones.

## Objetivo
El objetivo del patrón Iterator es proporcionar una interfaz uniforme para acceder a los elementos de una colección sin revelar su representación interna. Este patrón permite:

- Recorrer elementos en una colección de manera uniforme.
- Definir diferentes tipos de iteradores, permitiendo múltiples formas de acceder a una misma colección.
- Desacoplar la lógica de recorrido de la estructura interna de la colección.

## Diagrama de clases
![Diagrama de clases del patrón de comportamiento Iterator](src/main/resources/img/image.png)

## Estructura
1. **Iterator**: Interfaz base para todos los iteradores. Define métodos como first(), next(), currentElement(), y isDone() para navegar la colección.
2. **ConcreteIterator**: Implementación específica del iterador para recorrer la colección concreta ConcreteAggregate.
3. **Aggregate**: Interfaz para la colección que permite crear un iterador.
4. **ConcreteAggregate**: Implementación concreta de la colección que contiene los elementos Traspaso.
5. **Traspaso**: Clase modelo que representa los elementos de la colección con atributos como idTraspaso, nombre, y direccion.

## Ejecución
Para ejecutar el proyecto, asegúrate de tener configurado Maven y ejecuta los siguientes comandos:
```bash
    mvn clean install
    mvn exec:java
