package com.carbonwaste.model;

import java.sql.Timestamp;

public class WasteEntry {
    private int id;
    private String fuelType;
    private double distance;
    private double efficiency;
    private double totalCo2;
    private Timestamp entryDate;

    // Constructor for creating a new entry
    public WasteEntry(String fuelType, double distance, double efficiency, double totalCo2) {
        this.fuelType = fuelType;
        this.distance = distance;
        this.efficiency = efficiency;
        this.totalCo2 = totalCo2;
    }

    // Getters
    public int getId() { return id; }
    public String getFuelType() { return fuelType; }
    public double getDistance() { return distance; }
    public double getEfficiency() { return efficiency; }
    public double getTotalCo2() { return totalCo2; }
    public Timestamp getEntryDate() { return entryDate; }

    // Setters (Required for the 'Read' operation)
    public void setId(int id) { this.id = id; }
    public void setEntryDate(Timestamp entryDate) { this.entryDate = entryDate; }
}