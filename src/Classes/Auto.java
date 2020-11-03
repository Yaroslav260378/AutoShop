package Classes;

public abstract class Auto extends Vehicle {
    private double engine_capacity; //объем двигателя
    private int engine_power;
    private double fuel_consumption; //расход топлива на 100км

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_power(int engine_power) {
        this.engine_power = engine_power;
    }

    public int getEngine_power() {
        return engine_power;
    }

    public void setFuel_consumption(double fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public double getFuel_consumption() {
        return fuel_consumption;
    }
}
