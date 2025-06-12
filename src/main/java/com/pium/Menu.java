package com.pium;

import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*************************************** ");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");
            System.out.println("*************************************** ");
            System.out.print("Elija una opción: ");

            int eleccion = scanner.nextInt();
            String base = "";
            String destino = "";

            switch (eleccion) {
                case 1 -> { base = "USD"; destino = "ARS"; }
                case 2 -> { base = "ARS"; destino = "USD"; }
                case 3 -> { base = "USD"; destino = "BRL"; }
                case 4 -> { base = "BRL"; destino = "USD"; }
                case 5 -> { base = "USD"; destino = "COP"; }
                case 6 -> { base = "COP"; destino = "USD"; }
                case 7 -> {
                    System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                    return;
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
                }
            }

            System.out.print("Ingrese el monto en " + base + ": ");
            double monto = scanner.nextDouble();

            try {
                Conversor conversor = new ConexionApi().conectar(base);
                double resultado = monto * conversor.conversion_rates().get(destino);

                System.out.printf("%.2f %s equivalen a %.2f %s%n", monto, base, resultado, destino);
            } catch (Exception e) {
                System.out.println("Hubo un problema al obtener la tasa de conversión. Intente más tarde.");
            }
            System.out.println();
        }
    }
}

