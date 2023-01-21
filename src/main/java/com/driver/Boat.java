package com.driver;

public class Boat implements WaterVehicle {
    String name;
    int capacity;

    public Boat() {
        this.name=getVehicleName();
        this.capacity=getVehicleCapacity();
    }

    public String getVehicleName() {
        return this.name;
    }

    public int getVehicleCapacity() {
        return this.capacity;
    }
}
