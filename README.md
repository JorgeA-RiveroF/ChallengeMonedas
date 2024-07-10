# ChallengeMonedas

*[Índice](#índice)
* [Descripción del proyecto](#descripción-del-proyecto)
* [Estado del proyecto](#estado-del-proyecto)
* [Acceso al proyecto](#acceso-al-proyecto)
* [Tecnologías utilizadas](#tecnologías-utilizadas)
* [Desarrollador del Proyecto](#desarrollador-del-proyecto)
* [Conclusión](#conclusión)

## Descripción del proyecto

Desarrollo del primer Challenge de la formación Backend de Oracle Next Education con ALURA, el cual consiste en realizar una aplicación de consola que haga conversión de divisas mediante una API. Se utilizó el IDE de IntelliJ para programar la aplicación en JAVA 17. Mediante una public key de la API del sitio [exchangerate-api.com](https://www.exchangerate-api.com/), se hace la consulta de los valores de las divisas. Dentro del código se usaron funciones.

## Descripción de funcionamiento

Al correr la aplicación, se inicia con un menú con 6 tipos de cambios, la opción de usar otras monedas y la opción de salir de la aplicación. Para hacer la selección, se debe introducir el número de la opción.

- Si se selecciona un número del 1 al 6, se realiza la conversión con los valores de la opción y se solicitará que se ingrese la cantidad a convertir.
  
![menuPrincipal](https://github.com/JorgeA-RiveroF/ChallengeMonedas/assets/141877259/1e1842cc-4052-44f3-9492-3a0745225fc3)

- Si se selecciona otras monedas (opción 7), el menú cambia a uno donde muestra las diferentes monedas y se solicitará ingresar el número de la moneda de referencia, el número de la moneda de cambio y la cantidad de consulta. En caso de enviar el número 15, nos retorna al menú principal.

![menuSecundario](https://github.com/JorgeA-RiveroF/ChallengeMonedas/assets/141877259/1ca85f5f-1211-4a41-8c12-053320a2f395)

- Al seleccionar Salir (opción 9), finaliza la aplicación desplegando el registro de las consultas con la fecha y hora en la que se solicitó.

![reporteFinal](https://github.com/JorgeA-RiveroF/ChallengeMonedas/assets/141877259/9e92aab1-5d2c-40dd-8547-5fbcf6972394)

## Estado del proyecto

   ![Badge en Desarollo](https://img.shields.io/badge/STATUS-%20FINALIZADO-orange)


## Acceso al proyecto

Al descargar el repository se puede compilar el programa de la principal localizado en monedasApp/src/com/challengemonedas/principal/Principal.java

## Tecnologías utilizadas

- JAVA 17
- IntelliJ IDEA
- [exchangerate-api.com](https://www.exchangerate-api.com/)


## Desarrollador del Proyecto

Jorge A. Rivero Fragoso


## Conclusión
Este proyecto de conversión de monedas proporciona una herramienta sencilla y eficiente para realizar conversiones entre diversas divisas utilizando una API, la biblioteca Gson para el manejo de JSON y java.time para la manipulación de fechas y horas. 





