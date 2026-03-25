package com.carbonwaste.util;

public class Calculator {
    // Constants for CO2 produced per unit of fuel (in kg)
    private static final double DIESEL_FACTOR = 2.64;
    private static final double PETROL_FACTOR = 2.39;
    private static final double LPG_FACTOR = 1.67;
    private static final double CNG_FACTOR = 2.67;

    public static double calculate(String fuelType, double distance, double efficiency) {
        // Validation to prevent division by zero
        if (efficiency <= 0) return 0.0;

        // Step 1: Calculate total fuel consumed (Distance / Mileage)
        double fuelConsumed = distance / efficiency;

        // Step 2: Multiply fuel consumed by the specific CO2 factor
        return switch (fuelType.toLowerCase()) {
            case "diesel" -> fuelConsumed * DIESEL_FACTOR;
            case "petrol" -> fuelConsumed * PETROL_FACTOR;
            case "lpg" -> fuelConsumed * LPG_FACTOR;
            case "cng" -> fuelConsumed * CNG_FACTOR;
            default -> 0.0; // Returns 0 if fuel type is unrecognized
        };
    }
}