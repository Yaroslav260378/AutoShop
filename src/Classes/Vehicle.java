package Classes;

public abstract class Vehicle {
    protected String name;
    protected String color;
    protected int year;
    protected double price;
    protected int number_of_wheels;
    protected int max_speed;

    abstract public void showVehicle();
}
