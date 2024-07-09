package com.challengemonedas.principal;

import com.challengemonedas.modelo.Moneda;
import com.challengemonedas.servicio.ConsultaAPI;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal implements menu {
    private static final Gson gson = new Gson();
    private static final Scanner lectura = new Scanner(System.in);
    private static final ConsultaAPI consulta = new ConsultaAPI();
    private static final List<ConsultaGuardada> consultasGuardadas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        System.out.println(bienvenida);

        do {
            System.out.println(menu);
            opcion = lectura.nextInt();
            manejarOpcion(opcion);
        } while (opcion != 9);
    }

    private static void manejarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> manejarConversion("USD", "ARS");
            case 2 -> manejarConversion("ARS", "USD");
            case 3 -> manejarConversion("USD", "BRL");
            case 4 -> manejarConversion("BRL", "USD");
            case 5 -> manejarConversion("USD", "CLP");
            case 6 -> manejarConversion("CLP", "USD");
            case 7 -> manejarOtrasMonedas();
            case 9 -> registroFinal();
            default -> System.out.println("Opción no encontrada, por favor verifique el número correcto.");
        }
    }

    private static void manejarConversion(String monedaRef, String monedaCam) {
        System.out.println(requestCantidad);
        double cantidad = lectura.nextDouble();
        Moneda moneda = consulta.conversionMoneda(monedaRef, monedaCam, cantidad);
        String jsonString = gson.toJson(moneda);

        // Extraer solo el resultado de conversión
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        String resultado = jsonObject.get("conversion_result").getAsString();
        System.out.println("El resultado de la conversión de " + cantidad + " ["+ monedaRef + "] es " + resultado + " [" + monedaCam +"]");

        guardarConsulta(monedaRef, monedaCam, cantidad, resultado);
    }

    private static void manejarOtrasMonedas() {
        int opcionOtrasMonedas = 0;
        String monedaRef = "";
        String monedaCam = "";
        int i = 0, j = 0;

        while (opcionOtrasMonedas != 15) {
            System.out.println(menuOtrasMonedas);

            while (i != 2) {
                if (j == 0) {
                    System.out.println(requestMonedaRef);
                } else if (j == 1) {
                    System.out.println(requestMonedaCam);
                }

                opcionOtrasMonedas = lectura.nextInt();

                String moneda = seleccionarMoneda(opcionOtrasMonedas);
                if (moneda != null) {
                    if (i == 0) {
                        monedaRef = moneda;
                    } else {
                        monedaCam = moneda;
                    }
                    i++;
                    j++;
                }

                if (opcionOtrasMonedas == 15) {
                    System.out.println("Regresando");
                    i = 2;
                }
            }

            if (opcionOtrasMonedas != 15) {
                manejarConversion(monedaRef, monedaCam);
            }
            i = 0;
            j = 0;
        }
    }

    private static String seleccionarMoneda(int opcion) {
        return switch (opcion) {
            case 1 -> "USD";
            case 2 -> "ARS";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "MXN";
            case 7 -> "CNY";
            case 8 -> "CAD";
            case 9 -> "EUR";
            case 10 -> "GBP";
            case 11 -> "JPY";
            case 12 -> "KRW";
            case 13 -> "QAR";
            case 14 -> "TRY";
            default -> null;
        };
    }

    private static void guardarConsulta(String monedaRef, String monedaCam, double cantidad, String resultado) {
        String fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        consultasGuardadas.add(new ConsultaGuardada(monedaRef, monedaCam, cantidad, resultado, fecha));
    }

    private static void registroFinal() {
        imprimirConsultasGuardadas();
    }

    private static void imprimirConsultasGuardadas() {
        System.out.println(menuReporte);
        for (ConsultaGuardada consulta : consultasGuardadas) {
            System.out.println(consulta);
        }
    }

    private record ConsultaGuardada(String monedaRef, String monedaCam, double cantidad, String resultado,
                                    String fecha) {

        @Override
            public String toString() {
                return "Fecha: " + fecha +
                        ", Consulta: " + cantidad + " [" + monedaRef + "]" +
                        ", Resultado: " + resultado + " [" + monedaCam + "]";
            }
        }
}