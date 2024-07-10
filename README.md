# ChallengeMonedas

Desarrollo del primer Challenge de la formación Backend de Oracle Next Education con ALURA, el cual consiste en realizar una aplicación de consola que haga conversión de divisas mediante una API.

## Descripción Detallada

Se utilizó el IDE de IntelliJ para programar la aplicación en JAVA 17. Mediante una public key de la API del sitio [exchangerate-api.com](https://www.exchangerate-api.com/), se hace la consulta de los valores de las divisas. Dentro del código se usaron funciones.

## Descripción de funcionamiento

Al correr la aplicación, se inicia con un menú con 6 tipos de cambios, la opción de usar otras monedas y la opción de salir de la aplicación. Para hacer la selección, se debe introducir el número de la opción.

- Si se selecciona un número del 1 al 6, se realiza la conversión con los valores de la opción y se solicitará que se ingrese la cantidad a convertir.

- Si se selecciona otras monedas (opción 7), el menú cambia a uno donde muestra las diferentes monedas y se solicitará ingresar el número de la moneda de referencia, el número de la moneda de cambio y la cantidad de consulta. En caso de enviar el número 15, nos retorna al menú principal.

- Al seleccionar Salir (opción 9), finaliza la aplicación desplegando el registro de las consultas con la fecha y hora en la que se solicitó.


