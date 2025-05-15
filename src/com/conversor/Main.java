package com.conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService api = new ExchangeRateService();
        CurrencyConverter conversor = new CurrencyConverter();

        while (true) {
            System.out.println("\n=== Conversor de Monedas ===");
            System.out.println("1. Dólar (USD) → Real brasileño (BRL)");
            System.out.println("2. Dólar (USD) → Peso chileno (CLP)");
            System.out.println("3. Dólar (USD) → Peso colombiano (COP)");
            System.out.println("4. Real brasileño (BRL) → Dólar (USD)");
            System.out.println("5. Peso chileno (CLP) → Dólar (USD)");
            System.out.println("6. Peso colombiano (COP) → Dólar (USD)");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, ingrese un número del menú.");
                scanner.next();
                continue;
            }

            int opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 7) {
                System.out.println("Por favor, elige una opción válida del menú (1 al 7).");
                continue;
            }

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de monedas.");
                break;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Cantidad inválida. Por favor ingrese un número válido.");
                scanner.next();
                continue;
            }

            double cantidad = scanner.nextDouble();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
                continue;
            }

            String baseCurrency = "";
            String targetCurrency = "";

            switch (opcion) {
                case 1 -> { baseCurrency = "USD"; targetCurrency = "BRL"; }
                case 2 -> { baseCurrency = "USD"; targetCurrency = "CLP"; }
                case 3 -> { baseCurrency = "USD"; targetCurrency = "COP"; }
                case 4 -> { baseCurrency = "BRL"; targetCurrency = "USD"; }
                case 5 -> { baseCurrency = "CLP"; targetCurrency = "USD"; }
                case 6 -> { baseCurrency = "COP"; targetCurrency = "USD"; }
            }

            double tasa = api.obtenerTasaCambio(baseCurrency, targetCurrency);
            if (tasa == -1) {
                System.out.println("No se pudo obtener la tasa de cambio.");
                continue;
            }

            double resultado = conversor.convertir(cantidad, tasa);
            System.out.printf("Resultado: %.2f %s = %.2f %s\n", cantidad, baseCurrency, resultado, targetCurrency);
        }

        scanner.close();
    }
}
