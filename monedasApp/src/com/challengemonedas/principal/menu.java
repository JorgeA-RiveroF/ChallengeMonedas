package com.challengemonedas.principal;

public interface menu {
    //Mensaje de bienvenida (Inicio de aplicación)
    String bienvenida = """ 
                                *** Bienvenido/a al Challenge 'Conversor de monedas' *** 
                                *** by J. A. Rivero Fragoso ***
                            """;

    //Impresion main menu
    String menu = """
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                *** Escriba el número de la opción que quiera consultar ***
                1 - Dólar -->> Peso argentino
                2 - Peso argentino -->> Dólar
                3 - Dólar -->> Real brasileño
                4 - Real brasileño -->> Dólar 
                5 - Dólar -->> Peso colombiano
                6 - Peso colombiano -->> Dólar
                7 - Usar otras monedas 
                
                9 - Salir
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                """;

    //Impresion menu secundario
    String menuOtrasMonedas = """
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                *** Estas son las monedas que puede consultar ***
                1  - USD - Dólar estadounidense          2  - ARS - Peso argentino
                3  - BRL - Real brasileño                4  - CLP - Peso chileno
                5  - COP - Peso colombiano               6  - MXN - Peso mexicano
                7  - CNY - Renminbi Chino                8  - CAD - Dólar canadiense 
                9  - EUR - Euro                          10 - GBP - Libra esterlina
                11 - JPY - Yen Japonés                   12 - KRW - Won sur coreano  
                13 - QAR - Riyal catarí                  14 - TRY - Lira turca 
                
                15 - Salir
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                """;
    String requestMonedaRef = """
                Ingrese el numero moneda referencia
                """;
    String requestMonedaCam = """
                Ingrese el numero moneda del cambio
                """;

    String requestCantidad = """
                Ingrese cantidad a convertir
                """;



    //Impresion menu final
    String menuReporte = """
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                *** Estas fueron tus consultas ***
                ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
                """;



}


