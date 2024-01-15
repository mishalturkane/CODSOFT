package com.codsoft.task4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.io.IOException;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Selection
        System.out.print("Enter base currency code: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency code: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Currency Rates
        String apiKey = "dd20dbe69e3d245170519f06";
        String apiEndpoint = "https://api.currencyapi.com/v3/latest?apikey=cur_live_33UFeLB0BGfLSRWaP03wbV6PUp2xYGfuYhy5EpXM";
        String urlStr = apiEndpoint + "?base=" + baseCurrency + "&symbols=" + targetCurrency + "&apikey=" + apiKey;

        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Scanner apiScanner = new Scanner(connection.getInputStream());
            StringBuilder response = new StringBuilder();

            while (apiScanner.hasNext()) {
                response.append(apiScanner.nextLine());
            }

            apiScanner.close();
            connection.disconnect();

            // Parse JSON response to get exchange rate
            double exchangeRate = parseExchangeRate(response.toString(), targetCurrency);

            // Amount Input
            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();

            // Currency Conversion
            double convertedAmount = amount * exchangeRate;

            // Display Result
            System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);

        } catch (IOException e) {
            System.out.println("Error connecting to the API: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double parseExchangeRate(String jsonResponse, String targetCurrency) {
        // Implement JSON parsing logic to extract the exchange rate from the API response
        // Return the extracted exchange rate as a double
        return 0.0; // Placeholder value, replace with actual parsing logic
    }
}
