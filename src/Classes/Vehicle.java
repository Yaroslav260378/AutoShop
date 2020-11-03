package Classes;

public abstract class Vehicle {
    private String name;
    private String color;
    private int year;
    private double price;
    private int number_of_wheels;
    private int max_speed;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumber_of_wheels(int number_of_wheels) {
        this.number_of_wheels = number_of_wheels;
    }

    public int getNumber_of_wheels() {
        return number_of_wheels;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    abstract public void showVehicle();
}
