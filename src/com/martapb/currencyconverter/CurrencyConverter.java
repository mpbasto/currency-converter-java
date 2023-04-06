package com.martapb.currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter 3000! Here are your current options:");
        System.out.println("1. GBP");
        System.out.println("2. EUR");
        System.out.println("3. USD");

        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the currency you want to convert from (1, 2 or 3):");
        int selected_currency = scanner.nextInt();

        // Conversion
        switch(selected_currency) {
            case 1:
                System.out.println("Enter the amount (in GBP): ");
                double GBP_amount = scanner.nextDouble();
                GBP_to_currency(GBP_amount);
                break;
            case 2:
                System.out.println("Enter the amount (in EUR): ");
                double EUR_amount = scanner.nextDouble();
                EUR_to_currency(EUR_amount);
                break;
            case 3:
                System.out.println("Enter the amount (in USD): ");
                double USD_amount = scanner.nextDouble();
                USD_to_currency(USD_amount);
                break;
            default:
                System.out.println("Selected currency not valid.");
        }
    }

    public static void GBP_to_currency(double value){
        // to EUR
        System.out.println();
        System.out.println("Current rate for EUR:");
        System.out.println("1 GBP = " + 1.14 + " EUR");
        System.out.println();

        System.out.println("--> Conversion: " + value + " GBP is " + (value * 1.14) + " EUR");
        System.out.println();

        // to USD
        System.out.println("Current rate for USD:");
        System.out.println("1 GBP = " + 1.24 + " USD");
        System.out.println();

        System.out.println("--> Conversion: " + value + " GBP is " + (value * 1.24) + " USD");
    }

    public static void EUR_to_currency(double value){
        // to USD
        System.out.println();
        System.out.println("Current rate for USD:");
        System.out.println("1 EUR = " + 1.09 + " USD");
        System.out.println();

        System.out.println("--> Conversion: " + value + " EUR is " + (value * 1.09) + " USD");
        System.out.println();

        // to GBP
        System.out.println("Current rate for GBP:");
        System.out.println("1 EUR = " + 0.88 + " GBP");
        System.out.println();

        System.out.println("--> Conversion: " + value + " EUR is " + (value * 0.88) + " GBP");
    }

    public static void USD_to_currency(double value){
        // to EUR
        System.out.println();
        System.out.println("Current rate for EUR:");
        System.out.println("1 USD = " + 0.92 + " EUR");
        System.out.println();

        System.out.println("--> Conversion: " + value + " USD is " + (value * 0.92) + " EUR");
        System.out.println();

        // to GBP
        System.out.println("Current rate for GBP:");
        System.out.println("1 USD = " + 0.8 + " GBP");
        System.out.println();

        System.out.println("--> Conversion: " + value + " USD is " + (value * 0.8) + " GBP");
    }
}
