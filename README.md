# Monorepositorio-Patrones_Comportamiento
Este repositorio contiene ejemplos prácticos de los principales patrones de diseño de comportamiento implementados en Java. Estos patrones de diseño permiten organizar y estructurar interacciones entre objetos en una aplicación orientada a objetos, optimizando la comunicación y colaboración entre clases de manera eficiente y modular.

## Tabla de Contenidos
- [Descripción del Proyecto](#descripción-del-proyecto)
- [Patrones Implementados](#patrones-implementados)
- [Requisitos](#requisitos)
- [Ejecución de Ejemplos](#ejecución-de-ejemplos)
- [Consideraciones](#consideraciones)

## Descripción del Proyecto

El objetivo de este proyecto es proporcionar implementaciones claras y funcionales de patrones de diseño de comportamiento. Cada patrón incluye un ejemplo práctico que sigue las mejores prácticas de diseño orientado a objetos y se estructura para ser accesible y didáctico. Estos patrones facilitan el diseño de aplicaciones robustas y escalables, optimizando la forma en que los objetos interactúan y gestionan la lógica de negocio en distintos contextos.

## Patrones Implementados
1. [Chain of Responsibility](./ChainOfResponsibilityPattern/)
2. [Command](./CommandPattern/)
3. [Interpreter](./InterpreterPattern/)
4. [Iterator](./IteratorPattern/)
5. [Mediator](./MediatorPattern/)
6. [Visitor](./VisitorPattern/)

## Requisitos

- **Java**: Versión 17 o superior.
- **Maven**: Versión 3.1.0 o superior. Para compilar y gestionar dependencias.

## Ejecución de Ejemplos

Cada patrón tiene su propia implementación dentro de un subdirectorio. Para ejecutar un ejemplo específico, sigue estos pasos:

1. Clona el repositorio:
   ```bash
   git clone https://github.com/JO503688/Monorepositorio-Patrones_Comportamiento.git
   cd Monorepositorio-Patrones_Comportamiento
2. Navega al directorio del patrón que deseas probar:
    ```bash
    cd <nombre_del_directorio>
3. Compila y ejecuta el ejemplo usando Maven:
    ```bash
    mvn clean install
    mvn exec:java

Cada ejemplo tiene una clase principal (Main.java) que puedes ejecutar para ver cómo funciona el patrón en un caso de uso.

## Consideraciones
Estos ejemplos están diseñados para servir como referencia para el estudio de patrones de diseño de comportamiento en Java. No están optimizados para entornos de producción, ya que se enfocan en demostrar el uso y los beneficios de cada patrón en un contexto didáctico.
