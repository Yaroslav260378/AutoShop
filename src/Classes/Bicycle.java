package Classes;

public class Bicycle extends Vehicle{
    private int type_of_brakes; //тип тормозов (дисковые/ободные)
    private int type_of_bicycle; //спорт/туристический/горный

    public Bicycle(String name, String color, int year, double price, int number_of_wheels, int max_speed
            , int type_of_bicycle, int type_of_brakes)
    {
        setName(name);
        setColor(color);
        setYear(year);
        setPrice(price);
        setNumber_of_wheels(number_of_wheels);
        setMax_speed(max_speed);
        setType_of_bicycle(type_of_bicycle);
        setType_of_brakes(type_of_brakes);
    }

    public void setType_of_brakes(int type_of_brakes) {
        this.type_of_brakes = type_of_brakes;
    }

    public int getType_of_brakes() {
        return type_of_brakes;
    }

    public void setType_of_bicycle(int type_of_bicycle) {
        this.type_of_bicycle = type_of_bicycle;
    }

    public int getType_of_bicycle() {
        return type_of_bicycle;
    }

    @Override
    public void showVehicle() {
        System.out.println("\nМодель: "+getName()+"\nЦвет: "+getColor()+"\nГод выпуска: "+getYear()
                +"\nЦена: "+getPrice());
    }
}
